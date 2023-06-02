package sec04.exam05;

public class HttpServletExample {

	public static void main(String[] args) {
		method(new LoginServlet()); //로그인합니다.
		method(new FileDownloadServlet());
	}

	public static void method (HttpServlet servlet) { //var HttpServlet servlet =new Login servlet
		servlet.service();
	}
	
}
