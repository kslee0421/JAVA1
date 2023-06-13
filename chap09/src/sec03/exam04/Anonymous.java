package sec03.exam04;

public class Anonymous {
	private int field;
	
	public void method(final int arg1, int arg2) {
		final int var1 = 0;
		int var2 = 0;
		field =10;
		
		//arg1 = 10; 에러 final 이므로
		//arg2 = 10; 에러 final 이므로  final이 없어도 안의 메소드는 파이널이었다.
		
		Calculatable calc = new Calculatable() {

			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 +var2;
				return result;
			}
			
		};
		System.out.println(calc.sum());
	}
}
