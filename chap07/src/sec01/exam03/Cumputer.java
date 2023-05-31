package sec01.exam03;

public class Cumputer extends Calculator {
	@Override
	double areaCircle(double r) {
	System.out.println(" Caculator 객체의  areaCircle() 실행");
	return Math.PI * r * r ;
	}
}
