package test;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	
		
		while(true) {
			System.out.println("입력 문자열 : ");
			String data = scanner.nextLine();
			if(data.equals("그만")){
				break;
			}
			System.out.println("출력값 :"+ data);
			System.out.println();
		}
		System.out.println("종료");
	}

}
