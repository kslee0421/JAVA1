package test10;

public class Button {
	OnClickListner listener;
	

	public void setOnClickListner(OnClickListner listener) {
		this.listener = listener;
	}
	
	void touch(){ //실제실행하는 거
		listener.onClick();
	}
	
	static interface OnClickListner{
		void onClick();
	}
	

	
}
