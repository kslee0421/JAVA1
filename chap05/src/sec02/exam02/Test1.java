package sec02.exam02;

public class Test1 {

	public static void main(String[] args) {
		double x = 5.0;
		double y = 0.0;
		
		double z = x%y ;
		
		if (Double.isNaN(z)) { 
			System.out.println("NaN !!!");
		}
		else {
			double result = z +10;
			System.out.println("결과 : "+ result);
		}

}
}