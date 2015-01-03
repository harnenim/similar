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
