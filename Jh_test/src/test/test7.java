package test;

public class test7 {

	public static void main(String[] args) {
		// 문자 리터럴 형태로 생성
		String example1 ="이장호";
		String example2 ="이장호";
		System.out.println(example1);
		System.out.println(example2);
		System.out.println(example1 == example2);
		
		
		// new 연산자로 생성 
		String example3 = new String("이장호");
		String example4 = new String("이장호");
		System.out.println(example3);
		System.out.println(example4);
		System.out.println(example3 == example4);
		
		// string 객체에서 구문 하나씩 나누는 법
		String example5 ="테스트 구문입니다.";
		char charExample5= example5.charAt(0);
		System.out.println(charExample5);
	}

}
