package test09;

public class ButtonExamlple {
	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnclickListener(new CallListener());
		btn.touch();
		
		btn.setOnclickListener(new MessageListener());
		btn.touch();
	}

}
