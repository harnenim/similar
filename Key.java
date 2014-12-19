package harne.similar;

import harne.johap.Johap;

public class Key {
	// 공백문자와 같게 취급할 문자열
	// 한 프로그램에선 동일하게 유지할 것이므로 static으로 선언
	static char[] filter = "()[]-~".toCharArray();
	public static void setFilter(char[] filter) {
		Key.filter = filter;
	}

	private int hand  ;
	private int finger;
	private int line  ;
	private int shift ;
	private int index ;
	
	public Key(int hand, int finger, int line, int shift, int index) {
		this.setKey(hand, finger, line, shift, index);
	}
	private void setKey(int hand, int finger, int line, int shift, int index) {
		this.hand   = hand  ;
		this.finger = finger;
		this.line   = line  ;
		this.shift  = shift ;
		this.index  = index ;
	}

	public Key() {
		this(' ');
	}
	public Key(char c) {
		this(c, 0);
	}
	public Key(char c, int i) {
		for(int j=0; j<filter.length; j++) {
			if(c==filter[j]) {
				this.setKey(0,0,0,0,i);
				return;
			}
		}
		switch(c) {
			case '\n' : this.setKey(0,0,0,0,i); break;
			case '\t' : this.setKey(0,0,0,0,i); break;
			case ' '  : this.setKey(0,0,0,0,i); break;
			case '　' : this.setKey(0,0,0,0,i); break;
			case '-'  : this.setKey(2,6,4,0,i); break;
			case '`'  : this.setKey(1,6,4,0,i); break;
			case '1'  : this.setKey(1,5,4,0,i); break;
			case '2'  : this.setKey(1,4,4,0,i); break;
			case '3'  : this.setKey(1,3,4,0,i); break;
			case '4'  : this.setKey(1,2,4,0,i); break;
			case '5'  : this.setKey(1,1,4,0,i); break;
			case '6'  : this.setKey(1,0,4,0,i); break;
			case '7'  : this.setKey(2,2,4,0,i); break;
			case '8'  : this.setKey(2,3,4,0,i); break;
			case '9'  : this.setKey(2,4,4,0,i); break;
			case '0'  : this.setKey(2,5,4,0,i); break;
	
			case '!'  : this.setKey(1,5,4,0,i); break;
			case '@'  : this.setKey(1,4,4,0,i); break;
			case '#'  : this.setKey(1,3,4,0,i); break;
			case '$'  : this.setKey(1,2,4,0,i); break;
			case '%'  : this.setKey(1,1,4,0,i); break;
			case '^'  : this.setKey(1,0,4,0,i); break;
			case '&'  : this.setKey(2,2,4,0,i); break;
			case '*'  : this.setKey(2,3,4,0,i); break;
			case '('  : this.setKey(2,4,4,0,i); break;
			case ')'  : this.setKey(2,5,4,0,i); break;
	
			case '['  : this.setKey(2,6,2,0,i); break;
			case ']'  : this.setKey(2,7,2,0,i); break;
			case '{'  : this.setKey(2,6,2,1,i); break;
			case '}'  : this.setKey(2,7,2,1,i); break;
	
			case ';'  : this.setKey(2,5,2,0,i); break;
			case ':'  : this.setKey(2,5,2,1,i); break;
			case '\'' : this.setKey(2,6,2,0,i); break;
			case '"'  : this.setKey(2,6,2,1,i); break;
	
			case ','  : this.setKey(1,4,1,0,i); break;
			case '.'  : this.setKey(1,5,1,0,i); break;
			case '/'  : this.setKey(1,6,1,0,i); break;
			case '<'  : this.setKey(1,4,1,1,i); break;
			case '>'  : this.setKey(1,5,1,1,i); break;
			case '?'  : this.setKey(1,6,1,1,i); break;
	
			case 'a'  : this.setKey(1,5,2,0,i); break;
			case 'b'  : this.setKey(1,1,1,0,i); break;
			case 'c'  : this.setKey(1,3,1,0,i); break;
			case 'd'  : this.setKey(1,3,2,0,i); break;
			case 'e'  : this.setKey(1,3,3,0,i); break;
			case 'f'  : this.setKey(1,2,2,0,i); break;
			case 'g'  : this.setKey(1,1,2,0,i); break;
			case 'h'  : this.setKey(2,1,2,0,i); break;
			case 'i'  : this.setKey(2,3,3,0,i); break;
			case 'j'  : this.setKey(2,2,2,0,i); break;
			case 'k'  : this.setKey(2,3,2,0,i); break;
			case 'l'  : this.setKey(2,4,2,0,i); break;
			case 'm'  : this.setKey(2,3,1,0,i); break;
			case 'n'  : this.setKey(2,2,1,0,i); break;
			case 'o'  : this.setKey(2,4,3,0,i); break;
			case 'p'  : this.setKey(2,5,3,0,i); break;
			case 'q'  : this.setKey(1,5,3,0,i); break;
			case 'r'  : this.setKey(1,2,3,0,i); break;
			case 's'  : this.setKey(1,4,2,0,i); break;
			case 't'  : this.setKey(1,1,3,0,i); break;
			case 'u'  : this.setKey(2,2,3,0,i); break;
			case 'v'  : this.setKey(1,2,1,0,i); break;
			case 'w'  : this.setKey(1,4,3,0,i); break;
			case 'x'  : this.setKey(1,4,1,0,i); break;
			case 'y'  : this.setKey(2,1,5,0,i); break;
			case 'z'  : this.setKey(1,5,1,0,i); break;
	
			case 'A'  : this.setKey(1,5,2,0,i); break;
			case 'B'  : this.setKey(1,1,1,0,i); break;
			case 'C'  : this.setKey(1,3,1,0,i); break;
			case 'D'  : this.setKey(1,3,2,0,i); break;
			case 'E'  : this.setKey(1,3,3,0,i); break;
			case 'F'  : this.setKey(1,2,2,0,i); break;
			case 'G'  : this.setKey(1,1,2,0,i); break;
			case 'H'  : this.setKey(2,1,2,0,i); break;
			case 'I'  : this.setKey(2,3,3,0,i); break;
			case 'J'  : this.setKey(2,2,2,0,i); break;
			case 'K'  : this.setKey(2,3,2,0,i); break;
			case 'L'  : this.setKey(2,4,2,0,i); break;
			case 'M'  : this.setKey(2,3,1,0,i); break;
			case 'N'  : this.setKey(2,2,1,0,i); break;
			case 'O'  : this.setKey(2,4,3,0,i); break;
			case 'P'  : this.setKey(2,5,3,0,i); break;
			case 'Q'  : this.setKey(1,5,3,0,i); break;
			case 'R'  : this.setKey(1,2,3,0,i); break;
			case 'S'  : this.setKey(1,4,2,0,i); break;
			case 'T'  : this.setKey(1,1,3,0,i); break;
			case 'U'  : this.setKey(2,2,3,0,i); break;
			case 'V'  : this.setKey(1,2,1,0,i); break;
			case 'W'  : this.setKey(1,4,3,0,i); break;
			case 'X'  : this.setKey(1,4,1,0,i); break;
			case 'Y'  : this.setKey(2,1,5,0,i); break;
			case 'Z'  : this.setKey(1,5,1,0,i); break;
	
			case 'ㄱ' : this.setKey(1,2,3,0,i); break;
			case 'ㄲ' : this.setKey(1,2,3,1,i); break;
			case 'ㄴ' : this.setKey(1,4,2,0,i); break;
			case 'ㄷ' : this.setKey(1,3,3,0,i); break;
			case 'ㄸ' : this.setKey(1,3,3,1,i); break;
			case 'ㄹ' : this.setKey(1,2,2,0,i); break;
			case 'ㅁ' : this.setKey(1,5,2,0,i); break;
			case 'ㅂ' : this.setKey(1,5,3,0,i); break;
			case 'ㅃ' : this.setKey(1,5,3,1,i); break;
			case 'ㅅ' : this.setKey(1,1,3,0,i); break;
			case 'ㅆ' : this.setKey(1,1,3,1,i); break;
			case 'ㅇ' : this.setKey(1,3,2,0,i); break;
			case 'ㅈ' : this.setKey(1,4,3,0,i); break;
			case 'ㅉ' : this.setKey(1,4,3,1,i); break;
			case 'ㅊ' : this.setKey(1,3,1,0,i); break;
			case 'ㅋ' : this.setKey(1,5,1,0,i); break;
			case 'ㅌ' : this.setKey(1,4,1,0,i); break;
			case 'ㅍ' : this.setKey(1,2,1,0,i); break;
			case 'ㅎ' : this.setKey(1,1,2,0,i); break;
	
			case 'ㅏ' : this.setKey(2,3,2,0,i); break;
			case 'ㅐ' : this.setKey(2,4,3,0,i); break;
			case 'ㅑ' : this.setKey(2,3,3,0,i); break;
			case 'ㅒ' : this.setKey(2,4,3,1,i); break;
			case 'ㅓ' : this.setKey(2,2,2,0,i); break;
			case 'ㅔ' : this.setKey(2,5,3,0,i); break;
			case 'ㅕ' : this.setKey(2,2,3,0,i); break;
			case 'ㅖ' : this.setKey(2,5,3,1,i); break;
			case 'ㅗ' : this.setKey(2,1,2,0,i); break;
			case 'ㅛ' : this.setKey(2,1,3,0,i); break;
			case 'ㅜ' : this.setKey(2,1,1,0,i); break;
			case 'ㅠ' : this.setKey(2,0,1,0,i); break;
			case 'ㅡ' : this.setKey(2,3,1,0,i); break;
			case 'ㅣ' : this.setKey(2,4,2,0,i); break;
	
			// 확인 불가능한 문자열 -> 키값은 아니지만 비교연산에서 일치하는 경우는 처리 가능
			default	:  this.setKey(c, 0, 0, 0, i);
		}
	}
	public int h() { return hand  ; }
	public int f() { return finger; }
	public int l() { return line  ; }
	public int s() { return shift ; }
	public int i() { return index ; }

	public Distance distance(Key k) {
		// 현재 Key와 k 사이의 거리
		return new Distance(this, k);
	}
	public double wrongPoint(Key k) {
		// 원래 눌렸어야 하는 키와의 거리
		// 거리의 다시 제곱근 (과도한 점수 배제)
		return Math.sqrt(distance(k).value());
	}
	public String toString() {
		return
		new StringBuilder()
			.append(h())
			.append('-').append(f()).append(l()).append(s())
			.append('/').append(i()).toString();
	}
	public boolean equals(Key k) {
		// return new Distance(this, k).value() == 0;
		return this.hand   == k.hand
		    && this.finger == k.finger
		    && this.line   == k.line
		    && this.shift  == k.shift;
	}

	public void set(Key k) {
		this.hand   = k.hand  ;
		this.finger = k.finger;
		this.line   = k.line  ;
		this.shift  = k.shift;
	}

	public static Key[] toKeys(String str) {
		char[] cs = str.toCharArray();
		Key[][] ks = new Key[cs.length][];
		int count = 0;
		for(int i=0; i<cs.length; i++) {
			char[] c = Johap.toTyping(cs[i]).toCharArray();
			count += c.length;
			ks[i] = new Key[c.length]; 
			for(int j=0; j<c.length; j++)
				ks[i][j] = new Key(c[j], i);
		}
		Key[] kStr = new Key[count+2];
		count = 0;
		for(int i=0; i<ks.length; i++)
			for(int j=0; j<ks[i].length; j++)
				kStr[count++] = ks[i][j];
		kStr[count++] = new Key(' ', ks.length  );
		kStr[count  ] = new Key(' ', ks.length+1);
		return kStr;
	}
}
