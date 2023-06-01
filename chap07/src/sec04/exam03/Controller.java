package sec04.exam03;

public class Controller {
	public Meberservice service;
	public void (MemberService service) {
		this.service = service;
	}
}


/*
 * Controller controller = new Controller();
 * controller.setService(______________________);
 * 
 * 1)new Service() //(X) 강제형변환을하지 않았으므로 쓸 수없다. 2)new MemberService() //(O) 1)new
 * AService() //(o) 1)new BService() //(o) 1)new BoardService() //(x) 1)new
 * DService() //(x)
 */