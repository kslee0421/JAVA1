package sec01.exam02;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2;
			v2 = v1 - 10;
			System.out.println(v2);
		}
		//int v3 = v1 + v2;
		// if 함수 밖을 벗어나면 v2는 소멸.
		//sysout 쓰고 Ctrl+Space 누르기.
	}

}
