package sec02.exam01;

public class Main {

	public static void main(String[] args) {
		A a = new A(); //인스턴스 멤버 클래스 객체 생성
		A.B b = a.new B();  //a 클래스 생성없이 b를 만들 수 없다는 뜻 
		b.field1 =3;
		b.method1();
		
		
		//정적 멤버 클래스 생성
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		
		A.C.field2 = 3;  // 위에안써도 그냥 쓸 수 있다
		A.C.method2();
		
		a.method();
	}

}
