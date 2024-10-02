package test;

public class test5 {

	public static void main(String[] args) {
		// garbage collector
		String example1="테스트 글자 입니다.";
		example1 = null;
		System.out.println(example1);
		
		int [] example2 = {};
		example2[0] = 1;
//		example2=null;
		// NullPointerException
		// example2[0]=10;
		
		System.out.println(example2[0]);

	}

}
