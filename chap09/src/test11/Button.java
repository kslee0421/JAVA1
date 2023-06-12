package test11;

public class Button {
	OnClickListener listener;
	
	static interface OnClickListener{
		void onClick();
	}

	public void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	};
	
	void touch(){
		 listener.onClick();
	};
}
