package ai.ineuron.trail;

public class ExceptionHandling {

	int i = 0;
	int j = 10;

	public int math() {
		int k = (j / i);
		throw new ArithmeticException();
	}

	public static void main(String[] args) {
		
			ExceptionHandling exceptionHandling = new ExceptionHandling();
			exceptionHandling.math();
		
		System.out.println("-------");
	}
}
