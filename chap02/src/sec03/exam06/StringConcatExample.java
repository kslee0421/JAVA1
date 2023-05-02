package sec03.exam06;

public class StringConcatExample {

	public static void main(String[] args) {
		//숫자연산
		int value = 10 + 2 + 8;
		System.out.println("value:" + value);
		
		//결합연산
		String str1 = 10 + 2 + "8";
		System.out.println("str1 :" + str1);
		
		String str2 = 10 + "2" +8 ;
		System.out.println("str2 :" + str2);
		
		String str3 = "10" + 2 +8 ; //앞에가 문자열이 먼저 나왔으므로 뒤에도 문자열 취급
		System.out.println("str3 :" + str3);
		
		String str4 = "10" + (2 +8) ; // 괄호부터 계산하므로 
		System.out.println("str4 :" + str4);
		

	}

}
