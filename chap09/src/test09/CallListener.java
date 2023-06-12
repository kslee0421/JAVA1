package test09;

public class CallListener implements Button.OnclickListener{
	//중첩 인터페이스
	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}

}
