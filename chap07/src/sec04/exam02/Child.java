package sec04.exam02;

public class Child extends Parent {
	public String name;
	
	public Child() {
		//super();이 생략되어있다.
		//상속일때 파라메터가 없을때 super가 숨어있다.  아무것도 없으니까 부모에 뭐가 있나 쳐다보는거 생성자에 아무것도 없으면 super가숨어있는 거다 
		System.out.println("홍길동");
		System.out.println("Child() call");
	}
	public Child(String name) {
		//파라메터가 있으므로 super가 없어도된다.
		this.name = name;
		System.out.println("Child (String name) call");
	}
}
