package sec03.exam02;

public class Anonymous{
	//필드 초기값으로 대입
	RemoteControl field = new RemoteControl () {

		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
			
		}

		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");			
		}

	};
	void method1() {
		RemoteControl localVer = new RemoteControl () {

			@Override
			public void turnOn() {
				System.out.println("Audio 를 켭니다.");
				
			}

			@Override
			public void turnOff() {
				System.out.println("Audio 를 끕니다.");			
			}
		};
		//로컬변수 부르기 
		localVer.turnOn();
		localVer.turnOff();
	}
	
	void method2(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
}
