package test09;

public class Button {
	OnclickListener listener; //인터페이스 타입 필드 (listner)를 선언
	
	//var OnclickListener listener = new aaa();//자동형변환 다형성
	public void setOnclickListener(OnclickListener listener) { 
		this.listener = listener;
	}
	
	
	//실제버튼을 클릭했을 떄 실행하는 내용을 작성하지 않음
	void touch() {
		listener.onClick(); //구현객체의 onClick() 메소드 호출
	}
	
	//중첩인터페이스 : 버튼을 클릭했을 때 실제로 실행할 내용을 담고 있는 구현 객체를 얻기 위해서...
	//ststic 객체선언없이 사용이 가능
	static interface OnclickListener{
		void onClick(); //인터페이스이므로 실행블록이 없는 ...
	}
	
	
}
