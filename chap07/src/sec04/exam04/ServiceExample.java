package sec04.exam04;

public class ServiceExample {

	public static void main(String[] args) {
		Controller controller =new Controller();
		//controller.setService(new Service()); 부모로 형변환이 안된 상태이므로 안됨
		//controller.service.login(); login 이 Controller안에 없으므로 실핼이 안된다
		controller.setService(new MemberService());
		controller.service.login();
		controller.setService(new AService());
		controller.service.login();
	}

}
