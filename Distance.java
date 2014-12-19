package harne.similar;

public class Distance {
	private int hand  ;
	private int finger;
	private int line  ;
	private int shift ;

	Distance(Key a, Key b) {
		hand   = a.h() - b.h();
		finger = a.f() - b.f();
		line   = a.l() - b.l();
		shift  = a.s() - b.s();
	}
	public double crossPoint(Distance d) { // 키가 서로 엇갈렸을 경우
		return
		Math.sqrt(
			Math.abs(hand   + d.hand  ) +
			Math.abs(finger + d.finger) +
			Math.abs(line   + d.line  ) +
			Math.abs(shift  + d.shift ) );
	}
	public int h() { return hand  ; }
	public int f() { return finger; }
	public int l() { return line  ; }
	public int s() { return shift ; }
	public double value() {
		return
		Math.sqrt(
			(hand   * hand  ) +
			(finger * finger) +
			(line   * line  ) +
			(shift  * shift ) );
	}
}
