package verify.exam04;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		
		int[] scores = {85,95,93};

		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-------------------------------------------------------------");
			System.out.print("선택 >");

			int selectNo = scanner.nextInt();

			if (selctNo == 1) {

			} else if (selectNo == 2) {
			} else if (selectNo == 3) {
			} else if (selectNo == 4) {
			} else if (selectNo == 5) {
				run = false;
			}
		}

	}
}
