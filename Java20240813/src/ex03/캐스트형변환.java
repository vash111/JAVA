package ex03;
/*
 * 수동 형변환 or 강제 형변환
 * 큰 자료형 -> 작은 자료형 대입한다.
 */
public class 캐스트형변환 {

	public static void main(String[] args) {
		
		short s1;
		int num1 = -32769;
		
		s1 = (short)num1;  //강제 형변환 int -> short 즉 50000 short(32767)공간에 넣겠다.		
		System.out.println(s1);
		
		double d1 = 10.2;
		
		int num2 = (int)d1; //강제 형변환
		
		System.out.println(num2);
		
		System.out.println("----------------------");
		/*
		 * 정수 연산 정수 => 정수
		   정수 연산 실수 = >실수
		   정수or실수 연산 문자 => 문자
		 */
		double d2 = 10 + 10.2; // 10.0 + 10.2 => 20.2
		
		String  str1 = 10 + "10";   // "10" + "20"  => "1020"
		
		System.out.println(d2);		
		System.out.println(str1);
		
		System.out.println(d2);		
		System.out.println(str1);
		
		System.out.println(d2);		
		System.out.println(str1);
	}

}
