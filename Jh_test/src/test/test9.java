package test;

public class test9 {

	public static void main(String[] args) {
		if(args.length!=2) {
			System.out.println("파라미터가 부족합니다.");
		}
		String example1 =args[0];
		String example2 =args[1];
		
		int numExample1= Integer.parseInt(example1);
		int numExample2= Integer.parseInt(example2);
		
		System.out.println(numExample1 + numExample2);
		

	}

}
