package sec02.exam07;

public class ForfloatCounterExample {

	public static void main(String[] args) {
		//float은 수치계산용으로는 불명확하므로 안 쓰인다.
		for(float x=0.1f; x<1.0f; x+=0.1f) {
			System.out.println(x);
		}
	}

}
