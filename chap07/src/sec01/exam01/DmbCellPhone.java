package sec01.exam01;

public class DmbCellPhone extends CellPhone{
	//필드
	int channel;
	
	
	
	//생성자
	DmbCellPhone(String model, String color, int channel){
		/*
		 * this.model = model; this.color = color;
		 */
		super(model, color);
		this.channel = channel;
		
//		부모에있는 것을 가져와
// 부보가 명시적으로 매개값을 받는 생성자가 있을경우 자식클래스를 작성할때 super()로 부모 생성자 호출할 떄 파라매터에 맞게 올바르게 호출할 수 있도록 만들어주지 않으면 컴파일 에러가 발생
	}
	void turnOnDmb() {
		System.out.println("채널" + channel + "번 Dmb 방송 수신을 시작합니다.");
	}
	void chagechannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널" + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	
}
