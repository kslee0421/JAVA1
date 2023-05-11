package sec02.exam04;

public class ArrayCreateByNewexample {

	public static void main(String[] args) {
		//int을 가지는 배열이름이 arr1 참조배열 형태의 길이 3개 짜리를 선언해보세요.		
		int [] arr1 = new int[3];
		for(int i=0; i<3; i++) {			
			System.out.println("arr1["+i+"] :" + arr1[i]);			
		}
		System.out.println("");
		//double을 가지는 배열이름이 arr1 참조배열 형태의 길이 3개 짜리를 선언해보세요.		
		double [] arr2 = new double[3];
		for(int i=0; i<3; i++) {			
			System.out.println("");
		}
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i=0; i<3; i++) {			
			System.out.println("arr2["+i+"] :" + arr2[i]);			
		}
		System.out.println("");
		//String을 가지는 배열이름이 arr3 참조배열 형태의 길이 3개 짜리를 선언해보세요.		
		String [] arr3 = new String[3];
		for(int i=0; i<3; i++) {			
			System.out.println("");
		}
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		for(int i=0; i<3; i++) {			
			System.out.println("arr3["+i+"] :" + arr3[i]);			
		}
		System.out.println("");
	
	}

}
