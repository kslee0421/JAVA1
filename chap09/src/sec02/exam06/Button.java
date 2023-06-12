package sec02.exam06;

public class Button {
	static interface OnClickListener{
		void onClick();
	}
	
	OnClickListener listener; //필드값

	public void setOnClickListener(OnClickListener listener) {
		this.listener = listener;   //set메소드 static은 객체 생성이 안되므로 필드 세팅을 하기위해 set메소드를 쓴다.
   	}
	
	void touch() { //추상메소드
		listener.onClick();
	}
	

}
