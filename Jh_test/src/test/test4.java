package test;

public class test4 {

	public static void main(String[] args) {
				// 정상 연산
		        double example1 = 5.0;
		        // NaN 발생
		        double example2 = 0.0 / 0.0;
		        // infinity 발생
		        double example3 = 5.0 / 0.0;
		        
		        System.out.println(Double.isNaN(example1)); 
		        System.out.println(Double.isNaN(example2));
		        System.out.println(example3);

	}

}
