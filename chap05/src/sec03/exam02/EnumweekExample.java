package sec03.exam02;

import java.util.Calendar;

public class EnumweekExample {

	public static void main(String[] args) {
		//main 트리거 역할을 하는 시작점
		Week today = null;
		//null 초기화
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		//cal에 오늘의 연월일월시분초 등등이들어온다.
		//그중 DAY_OF_WEEK 은 요일정보만 뽑겠다.
		//정보를 숫자로 받는다.
		//상수명은 대문자
		//week =week +2;
		switch(week) {
		case 1:
			today = Week.SUNDAY; break;
		case 2:
			today = Week.MONDAY; break;
		case 3:
			today = Week.TUESDAY; break;
		case 4:
			today = Week.WEDSDAY; break;
		case 5:
			today = Week.THURSDAY; break;
		case 6:
			today = Week.FRIDAY; break;
		case 7:
			today = Week.SATURDAY; break;
		}
		System.out.println("오늘 요일: " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 정처기 공부를 합니다.");			
		}else if(today == Week.MONDAY) {
			System.out.println("월요일은 슬퍼요.");
		}else if(today == Week.TUESDAY) {
			System.out.println("화요일은 화나요.");
		}
		else if(today == Week.WEDSDAY) {
			System.out.println("이제 반이 지났어요");
		}
		else if(today == Week.THURSDAY) {
			System.out.println("내일은 불금이에요");
		}
		else if(today == Week.FRIDAY) {
			System.out.println("아싸 이제 주말이에요");
		}
		else{
			System.out.println("평일에 못다한 공부를 해봅시다");
		}
	}

}
