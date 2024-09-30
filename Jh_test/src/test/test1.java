package test;

public class test1 {
	public static void main(String[] args) {
		int example1 = 200;
		int example3 = 300;
		int example2 = 100; 
		char example4 ='는';
		int example5 = 0b101;
		char example6 =32;
	
		System.out.println("예시"+ example4 +":" + (example1 + example2 + example3) );
		System.out.println("이것은 이진법 형태입니다."+ example5);
		System.out.println(example6 +"test");
		System.out.println("\\ \t dddd");
		System.out.println("개행 사용 :\nline change \nthis");
		System.out.println("""
							텍스트 블록 문법 사용 :
							line change
							this
							""");
		System.out.println("""
안녕\
하세요.
				""");
		System.out.println("carriage \r this");
	}
}
