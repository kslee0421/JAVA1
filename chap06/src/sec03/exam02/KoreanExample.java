package sec03.exam02;

import sec03.exam01.Car;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("이경선", "000226-123457");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);

		Korean k2 = new Korean("염무원", "950128-123457");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);

	}	
}
	
