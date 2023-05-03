package sec02.exam01;

public class SignOperationExample {

	public static void main(String[] args) {
		int x = -100;
		int result1 = +x; //-100
		int result2 = -x;//100
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		
		byte b = 100;
		//byte result3 = -b; //컴파일 에러
		int result3 = -b; // 한번을 집어넣는건되지만. 두번째에 넣을때는 int로 자동바뀐다.
		System.out.println("result3=" + result3);
	}

}
