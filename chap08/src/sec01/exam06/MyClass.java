package sec01.exam06;

public class MyClass {
	//필드의 다형성
	RemoteControl rc = new Television();  //
	
	//생성자
	MyClass(){
		
	}
	MyClass(RemoteControl rc){ //생성자의 
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	//메소드
	void methodA() {  //메소드의 지역변수로
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodA(RemoteControl rc) {  //메소드의 파라메타
		rc.turnOn();
		rc.setVolume(5);
	}
	
	
	
}
