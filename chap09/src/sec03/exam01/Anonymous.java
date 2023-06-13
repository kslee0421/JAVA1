package sec03.exam01;

public class Anonymous {
	//Anonymous 객체를 만들 수 있는 조건 (2가지중 하나만 만족)
	// 1.상속(인터페이스 구현) or 인터페이스 
	
	//필드 초기값으로 대입
	//new Person(){}; 부모를 상속받아서 자식객체를 만든 것, 자식객체이다.
	//Person() : 부모 클래스를 상속(implements)해서 
	//{} : 자식 클래스의 내용을 작성 자식클래스는 이름이 없다.
	//new : 이것을 가지고 객체를 생성해서 (자식객체 생성)
	
	//Person field : 부모클래스 변수 (field)에 대입 자동 형변환 => 자동형변환이 일어난다.
	Person field = new Person() {  //익명객체
		void work() {
			System.out.println("출근합니다.");
		}
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};
	
	//로컬변수
	void method1() {
		//로컬변수값으로 대입
		Person  localVer= new Person() {  //익명객체
			void walk() {
				System.out.println("산책합니다.");
			}
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};
		localVer.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
}








