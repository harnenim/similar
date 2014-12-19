package harne.similar;

import java.util.HashMap;
import java.util.Map;

public class Similar {
	private static Map<String, KeySet> keySets = new HashMap<String, KeySet>();
	private int start, end;
	private double point;

	public int start() {
		return start;
	}
	public int end() {
		return end;
	}
	public double point() {
		return point;
	}

	private Similar(int start, int end, double point) {
		this.start = start;
		this.end   = end  ;
		this.point = point;
	}
	private static Similar failed() {
		return new Similar(0, 0, Double.MAX_VALUE);
	}
	public static Similar test(String src, String cmp) {
		// 길이가 더 짧은 문자열은 퇴짜
		if(src.length() < cmp.length())
			return failed();

		// 비교 문자열이 3자 미만이면 일치하는 것 검사로 끝냄
		if(cmp.length()<3) {
			char[] cSrc = src.toCharArray();
			char[] cCmp = cmp.toCharArray();
			for(int i=0; i < cSrc.length-cCmp.length; i++) {
				int j;
				for(j=0; j<cCmp.length; j++)
					if(cSrc[i+j]!=cCmp[j])
						break;
				if(j==cCmp.length)
					return new Similar(i, i+j, 0);
			}
			return failed();
		}

		// 본격적 검사
		int start=0, end=0;
		double point = Double.MAX_VALUE;

		KeySet kSrc, kCmp;
		if((kSrc = keySets.get(src))==null)
			kSrc = new KeySet(Key.toKeys(src));
		if((kCmp = keySets.get(cmp))==null)
			kCmp = new KeySet(Key.toKeys(cmp));

		// 첫 2타가 일치할 때만 검사 시작
		for(int i=0; i<kSrc.length(); i++) {
			kSrc.setIndex(i-1);
			kCmp.beforeFirst();
			int j;
			for(j=0; j<2; j++) {
				kSrc.next();
				kCmp.next();
				if(!kSrc.get().equals(kCmp.get()))
					break;
			}
			if(j==2) {
				Similar temp = test(kSrc, kCmp, point);
				if(temp.point < point) {
					start = kSrc.get(i).i();
					end   = temp.end  ;
					point = temp.point;
				}
			}
		}
		return new Similar(start, end, point);
	}
	private static Similar test(KeySet src, KeySet cmp, double limit) {
		return test(src, cmp, 0, limit);
	}
	private static Similar test(KeySet src, KeySet cmp, double point, double limit) {
		while(src.next() && cmp.next()) {
			if(src.get().equals(cmp.get()))
				continue;

			// 오타 발생
			do {
				if(src.getNext()!=null && cmp.getNext()!=null) {
					Distance d2 = src.getNext(1).distance(cmp.getNext(1));
					if(d2.value()>0) { // 2타 연속 안 맞음
						if(src.getNext(0).equals(cmp.getNext(1))
						&& src.getNext(1).equals(cmp.getNext(2))) { // 탈자
							point += cmp.get().wrongPoint(new Key());
							cmp.next();
						} else if(src.getNext(1).equals(cmp.get())) {
							Distance d1 = src.get().distance(cmp.get());
							// 순서 바뀜
							if(d1.crossPoint(d2)==0) {
								point += src.get().wrongPoint(cmp.get())/2;
								src.next();
								cmp.next();
							} else {
								// 공백문자 예외
								if(cmp.get().equals(new Key()))
									point += 1;
								else
									point += cmp.get().wrongPoint(new Key());
								cmp.next();
							}
						} else {
							// 뒤쪽으로 건너뛰어서 3타 이상 겹치는 문자열 있는지 확인
							for(int i=src.getIndex(); src.getNext(i+2)!=null; i++) {
								for(int j=cmp.getIndex(); cmp.getNext(j+2)!=null; j++) {
									if(src.getNext(i  ).equals(cmp.getNext(j  ))
									&& src.getNext(i+1).equals(cmp.getNext(j+1))
									&& src.getNext(i+2).equals(cmp.getNext(j+2))) {
										src.setIndex(i+1);
										cmp.setIndex(j+1);
										return  test(src, cmp, point, limit);
									}
								}
							}
							// 뒤쪽에 겹치는 게 없었음 -> 남은 타수만큼 점수에 +
							point += (cmp.length() - cmp.getIndex()) * 2;
							break;
						}
					}
				}
				// '00'
				// ' 00' 등으로 밀려 쓴 경우
				// 2번째 글자가 같은 0인 걸로 처리 x
				// 첫 글자 하나만큼 밀린 걸로 처리해야 함
				if(src.getNext(0).equals(cmp.getNext(1)) && src.getNext(1).equals(cmp.getNext(2))) {
					point += cmp.get().wrongPoint(new Key());
					src.next(1);
					cmp.next(2);
				} else if(cmp.getNext(0).equals(src.getNext(1)) && cmp.getNext(1).equals(src.getNext(2))) {
					point += src.get().wrongPoint(new Key());
					src.next(2);
					cmp.next(1);
				} else {
					// 바로 다음에 칠 것이 아닌, 한쪽 손에서 치는 것끼리 순서가 꼬였을 수도 있음
					int pos = src.findHand(src.get().h());
					if(pos>0 && cmp.getNext(pos)!=null) {
						Distance d1 = src.get().distance(cmp.get());
						Distance d2 = src.getNext(pos).distance(cmp.getNext(pos));
						if(d1.crossPoint(d2)==0) {
							point += src.get().wrongPoint(cmp.get())/2;
							src.next();
							cmp.next();
							// 다음에 다시 확인하게 되므로 점수에 추가 안 되도록 막음
							src.getNext().set(cmp.getNext());
							continue;
						}
					}
					// 평범한 오타
					point += src.get().wrongPoint(cmp.get());
				}
			} while(false);

			if(point > limit)
				return failed();
		}
		return new Similar(0, src.getPos(), point);
	}

	public String toString() {
		return new StringBuilder()
			.append('[').append(start).append('-').append(end).append(']')
			.append(' ').append(point).toString();
	}
}
