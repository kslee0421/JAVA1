package sec02.exam01;

public class A {
	A(){System.out.println("A 객체가 생성됨");}
	
	//인스턴스 멤버 클래스
	public class B{
		B(){System.out.println("B 객체가 생성됨");}
		int field1;
		//static int field2; static은 객체를 생성하지 않고 쓸 수 있으므로, 객체를 생성하고 쓰는 인스턴스와 같이 쓸 수 없다.
		void method1() {}
		// void method2() {} A에 객체가 생성되지 않으면 쓸 수 있다.
	}
	//정적멤버 클래스
	static class C{
		C(){ System.out.println("C 객체가 생성됨");}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	void method() {
		//로컬클래스 : 변수 취급 안에서 사용하고 사라짐
		class D {  //외부에서 접근할 수 없기때문에 static을 사용안한다. instance다
			D() {System.out.println("D 객체가 생성됨");}
			int field1;
			//static int field2;
			void method1() {}
			//static void method2(){}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
