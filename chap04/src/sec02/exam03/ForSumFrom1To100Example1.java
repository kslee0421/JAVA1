package sec02.exam03;

public class ForSumFrom1To100Example1 {

	public static void main(String[] args) {
		int sum = 0; //밖에다 변수 선언
		int i = 0;
		for (i=1; i<=100; i++) { 
			sum +=i; 		
		}
		System.out.println("1~" + (i-1) + "합: " + sum);
   //101부터 빠져 나오니까  -1
	}

}

