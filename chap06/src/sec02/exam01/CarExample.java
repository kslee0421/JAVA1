package sec02.exam01;

import sec01.exam01.Student;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		//Car 클래스 자료형
		//myCar : 객체 , 클래스 변수 명 인스턴스
		//new Car() : 생성자 필드값을 초기화
		
		//필드 값 읽기
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.mode1);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);
	
		myCar.speed=60;
		
		System.out.println("현재속도: " + myCar.speed);

		
	}
	
	
	

}
