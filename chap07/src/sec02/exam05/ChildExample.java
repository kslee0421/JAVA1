package sec02.exam05;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 ="data1";
		parent.method1();
		parent.method2();
		
		//parent.field2="data2" 사용안됨
		//parent.method3(); 사용안됨 
		
		Child child =(Child)parent;
		child.field2 = "data2"; // (o)
		child.method3(); // (o)
		
	}

}
