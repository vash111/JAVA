package ex01_;

import java.util.Scanner;

public class AAA {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		
//		System.out.println(a + " : " + b +  " : " + " : " + c);
		
//		int korScore = sc.nextInt();
//		int engScore = sc.nextInt();
//		int mathScore = sc.nextInt();
//		
//		System.out.println(korScore + " : " + engScore +  " : " + " : " + mathScore);
		
//		String name = "홍길동";
//		System.out.println(name);
				
		char c1 = 65; //10진수
		char c2 = 'a';
		char c3 = '0';
		char c4 = 0x41; //16진수
		char c5 = 0101;  //8진수
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
//		
//		System.out.printf("%d %c\n", 65, 65);
		
		double sum = 0;
		for(int i=0; i<30; i++)
			sum += 0.1;
		System.out.println(sum);
		
		
		float f1 = 2147483648.0f;
		float f2 = 2147483638.0f;
		float f3 = 2147483968.0f;
		
		System.out.printf("%f\n", f1);
		System.out.printf("%f\n", f2);
		System.out.printf("%f\n", f3);
		System.out.println("-----------------------------");
		
		double f4 = 2147483648.0;
		double f5 = 2147483638.0;
		double f6 = 2147483968.0;
		
		System.out.printf("%f\n", f4);
		System.out.printf("%f\n", f5);
		System.out.printf("%f\n", f6);
		
	    boolean b1 = true;
	    boolean b2 = false;
	    
	}

}
