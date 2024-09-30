package test;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte example1 = 5;
		int intExample1 = example1;
		long longExample1 = intExample1;
		float floatExample1 = longExample1;
		double doubleExample1 = floatExample1;
		char charExample1= example1;
		System.out.println(intExample1);
		// 타입 자동변환
	    System.out.println(((Object) intExample1).getClass().getName()); 
	    System.out.println(((Object)example1).getClass().getName());
	    
	    System.out.println(((Object)longExample1).getClass().getName());
	    System.out.println(((Object)floatExample1).getClass().getName());
	    System.out.println(((Object)doubleExample1).getClass().getName());
	    // Type mismatch: cannot convert from byte to char (byte -> char)
//	    System.out.println(((Object)charExample1).getClass().getName());
	    

	}

}
