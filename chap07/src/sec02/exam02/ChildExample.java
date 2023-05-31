package sec02.exam02;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = child; //부모 클래스로의 타입변환
		
		//parent.method3(); 부모가되어서 child때 쓴거는 쓸 수가없다. 
		parent.method1();
		parent.method2();
	}

}
