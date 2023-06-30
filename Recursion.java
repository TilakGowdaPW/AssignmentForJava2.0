package ai.ineuron.trail;

import java.util.Scanner;

class RecursionDemo {
	int fact(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * fact(n - 1);
		}
	}
}

public class Recursion {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number for which you would like to print factorial");
		
		int n=scanner.nextInt();
		RecursionDemo demo=new RecursionDemo();
		System.out.println(demo.fact(n));
	}

}
