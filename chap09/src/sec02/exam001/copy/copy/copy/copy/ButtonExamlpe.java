package sec02.exam001.copy.copy.copy.copy;

public class ButtonExamlpe {

	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setListener(new CallListener());
		btn.touch();

	}

}
