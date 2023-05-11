package sec02.exam041;

public class ArrayLengthExample {

	public static void main(String[] args) {
		int [] scores = {83, 90, 87};
		
		int sum =0;
		for(int i=0; i<scores.length; i++) {			
			sum+= scores[i];			
		}
			//scores.lenght = 5; 오류 배열의 갯수는 한번 별정되면 바꿀 수 없음.
		System.out.println("총합: "+sum);
		
		double avg = (double)sum /scores.length;
		System.out.println("평균 : " + avg);
	}

}
