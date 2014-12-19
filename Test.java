package harne.similar;

public class Test {
	public static void main(String[] args) {

		System.out.println("입력 문자열 / 찾을 문자열");
		System.out.println("[범위] 점수");
		System.out.println("…＜찾은 범위＞…");


		String cmp = "테스트테스트";
		String str;
		Similar t;

		System.out.println();
		str = "qwwer테스트테스트waegw";
		System.out.println(str + " / " + cmp);
		t = Similar.test(str, cmp);
		System.out.println(t + "점");
		if(t.end()<=str.length())
			System.out.println(str.substring(0, t.start()) + "＜" + str.substring(t.start(), t.end()) + "＞" + str.substring(t.end()));

		System.out.println();
		str = "qwwer테스트텟트waegw";
		System.out.println(str + " / " + cmp);
		t = Similar.test(str, cmp);
		System.out.println(t + "점");
		if(t.end()<=str.length())
			System.out.println(str.substring(0, t.start()) + "＜" + str.substring(t.start(), t.end()) + "＞" + str.substring(t.end()));

		System.out.println();
		str = "qwwer테슽텟트waegw";
		System.out.println(str + " / " + cmp);
		t = Similar.test(str, cmp);
		System.out.println(t + "점");
		if(t.end()<=str.length())
			System.out.println(str.substring(0, t.start()) + "＜" + str.substring(t.start(), t.end()) + "＞" + str.substring(t.end()));

		System.out.println();
		str = "qwwer테ㅡㅅ트테스트w";
		System.out.println(str + " / " + cmp);
		t = Similar.test(str, cmp);
		System.out.println(t + "점");
		if(t.end()<=str.length())
			System.out.println(str.substring(0, t.start()) + "＜" + str.substring(t.start(), t.end()) + "＞" + str.substring(t.end()));

		System.out.println();
		str = "테슴ㄴㅇ서ㅐㄹ돈테슽테스트ㅈㄷㅎ";
		System.out.println(str + " / " + cmp);
		t = Similar.test(str, cmp);
		System.out.println(t + "점");
		if(t.end()<=str.length())
			System.out.println(str.substring(0, t.start()) + "＜" + str.substring(t.start(), t.end()) + "＞" + str.substring(t.end()));

		System.out.println();
		str = "테스트테스트waegw";
		System.out.println(str + " / " + cmp);
		t = Similar.test(str, cmp);
		System.out.println(t + "점");
		if(t.end()<=str.length())
			System.out.println(str.substring(0, t.start()) + "＜" + str.substring(t.start(), t.end()) + "＞" + str.substring(t.end()));

		System.out.println();
		str = "qwwer테스트테스트";
		System.out.println(str + " / " + cmp);
		t = Similar.test(str, cmp);
		System.out.println(t + "점");
		if(t.end()<=str.length())
			System.out.println(str.substring(0, t.start()) + "＜" + str.substring(t.start(), t.end()) + "＞" + str.substring(t.end()));

	
		cmp = "테스트";
	
		System.out.println();
		str = "qwwer테스트테스트waegw";
		System.out.println(str + " / " + cmp);
		t = Similar.test(str, cmp);
		System.out.println(t + "점");
		if(t.end()<=str.length())
			System.out.println(str.substring(0, t.start()) + "＜" + str.substring(t.start(), t.end()) + "＞" + str.substring(t.end()));

		System.out.println();
		str = "qwwer테스트텟트waegw";
		System.out.println(str + " / " + cmp);
		t = Similar.test(str, cmp);
		System.out.println(t + "점");
		if(t.end()<=str.length())
			System.out.println(str.substring(0, t.start()) + "＜" + str.substring(t.start(), t.end()) + "＞" + str.substring(t.end()));

		System.out.println();
		str = "qwwer테슽텟트waegw";
		System.out.println(str + " / " + cmp);
		t = Similar.test(str, cmp);
		System.out.println(t + "점");
		if(t.end()<=str.length())
			System.out.println(str.substring(0, t.start()) + "＜" + str.substring(t.start(), t.end()) + "＞" + str.substring(t.end()));

		System.out.println();
		str = "qwwer테ㅡㅅ트테스트w";
		System.out.println(str + " / " + cmp);
		t = Similar.test(str, cmp);
		System.out.println(t + "점");
		if(t.end()<=str.length())
			System.out.println(str.substring(0, t.start()) + "＜" + str.substring(t.start(), t.end()) + "＞" + str.substring(t.end()));

		System.out.println();
		str = "테슴ㄴㅇ서ㅐㄹ돈테슽테스트ㅈㄷㅎ";
		System.out.println(str + " / " + cmp);
		t = Similar.test(str, cmp);
		System.out.println(t + "점");
		if(t.end()<=str.length())
			System.out.println(str.substring(0, t.start()) + "＜" + str.substring(t.start(), t.end()) + "＞" + str.substring(t.end()));

		System.out.println();
		str = "테스트테스트waegw";
		System.out.println(str + " / " + cmp);
		t = Similar.test(str, cmp);
		System.out.println(t + "점");
		if(t.end()<=str.length())
			System.out.println(str.substring(0, t.start()) + "＜" + str.substring(t.start(), t.end()) + "＞" + str.substring(t.end()));

		System.out.println();
		str = "qwwer테스트테스트";
		System.out.println(str + " / " + cmp);
		t = Similar.test(str, cmp);
		System.out.println(t + "점");
		if(t.end()<=str.length())
			System.out.println(str.substring(0, t.start()) + "＜" + str.substring(t.start(), t.end()) + "＞" + str.substring(t.end()));

		System.out.println();
		str = "qwwer테스트";
		System.out.println(str + " / " + cmp);
		t = Similar.test(str, cmp);
		System.out.println(t + "점");
		if(t.end()<=str.length())
			System.out.println(str.substring(0, t.start()) + "＜" + str.substring(t.start(), t.end()) + "＞" + str.substring(t.end()));


		cmp = "건담00";

		System.out.println();
		str = "기동전사 건담00";
		System.out.println(str + " / " + cmp);
		t = Similar.test(str, cmp);
		System.out.println(t + "점");
		if(t.end()<=str.length())
			System.out.println(str.substring(0, t.start()) + "＜" + str.substring(t.start(), t.end()) + "＞" + str.substring(t.end()));

		System.out.println();
		str = "기동전사 건담 00";
		System.out.println(str + " / " + cmp);
		t = Similar.test(str, cmp);
		System.out.println(t + "점");
		if(t.end()<=str.length())
			System.out.println(str.substring(0, t.start()) + "＜" + str.substring(t.start(), t.end()) + "＞" + str.substring(t.end()));


		cmp = "건담 00";

		System.out.println();
		str = "기동전사 건담00";
		System.out.println(str + " / " + cmp);
		t = Similar.test(str, cmp);
		System.out.println(t + "점");
		if(t.end()<=str.length())
			System.out.println(str.substring(0, t.start()) + "＜" + str.substring(t.start(), t.end()) + "＞" + str.substring(t.end()));

		System.out.println();
		str = "기동전사 건담00 1화";
		System.out.println(str + " / " + cmp);
		t = Similar.test(str, cmp);
		System.out.println(t + "점");
		if(t.end()<=str.length())
			System.out.println(str.substring(0, t.start()) + "＜" + str.substring(t.start(), t.end()) + "＞" + str.substring(t.end()));

		System.out.println();
		str = "기동전사 건담 00";
		System.out.println(str + " / " + cmp);
		t = Similar.test(str, cmp);
		System.out.println(t + "점");
		if(t.end()<=str.length())
			System.out.println(str.substring(0, t.start()) + "＜" + str.substring(t.start(), t.end()) + "＞" + str.substring(t.end()));

	}
}

/*

입력 문자열 / 찾을 문자열
[범위] 점수
…＜찾은 범위＞…

qwwer테스트테스트waegw / 테스트테스트
[5-11] 0.0점
qwwer＜테스트테스트＞waegw

qwwer테스트텟트waegw / 테스트테스트
[5-10] 1.9343364202676694점
qwwer＜테스트텟트＞waegw

qwwer테슽텟트waegw / 테스트테스트
[5-9] 3.8686728405353388점
qwwer＜테슽텟트＞waegw

qwwer테ㅡㅅ트테스트w / 테스트테스트
[5-12] 2.598076211353316점
qwwer＜테ㅡㅅ트테스트＞w

테슴ㄴㅇ서ㅐㄹ돈테슽테스트ㅈㄷㅎ / 테스트테스트
[8-13] 1.9343364202676694점
테슴ㄴㅇ서ㅐㄹ돈＜테슽테스트＞ㅈㄷㅎ

테스트테스트waegw / 테스트테스트
[0-6] 0.0점
＜테스트테스트＞waegw

qwwer테스트테스트 / 테스트테스트
[5-11] 0.0점
qwwer＜테스트테스트＞

qwwer테스트테스트waegw / 테스트
[5-8] 0.0점
qwwer＜테스트＞테스트waegw

qwwer테스트텟트waegw / 테스트
[5-8] 0.0점
qwwer＜테스트＞텟트waegw

qwwer테슽텟트waegw / 테스트
[7-9] 1.9343364202676694점
qwwer테슽＜텟트＞waegw

qwwer테ㅡㅅ트테스트w / 테스트
[9-12] 0.0점
qwwer테ㅡㅅ트＜테스트＞w

테슴ㄴㅇ서ㅐㄹ돈테슽테스트ㅈㄷㅎ / 테스트
[10-13] 0.0점
테슴ㄴㅇ서ㅐㄹ돈테슽＜테스트＞ㅈㄷㅎ

테스트테스트waegw / 테스트
[0-3] 0.0점
＜테스트＞테스트waegw

qwwer테스트테스트 / 테스트
[5-8] 0.0점
qwwer＜테스트＞테스트

qwwer테스트 / 테스트
[5-8] 0.0점
qwwer＜테스트＞

기동전사 건담00 / 건담00
[5-9] 0.0점
기동전사 ＜건담00＞

기동전사 건담 00 / 건담00
[5-10] 0.0점
기동전사 ＜건담 00＞

기동전사 건담00 / 건담 00
[5-9] 0.0점
기동전사 ＜건담00＞

기동전사 건담00 1화 / 건담 00
[5-9] 0.0점
기동전사 ＜건담00＞ 1화

기동전사 건담 00 / 건담 00
[5-10] 0.0점
기동전사 ＜건담 00＞

*/
