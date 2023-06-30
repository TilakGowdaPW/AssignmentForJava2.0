package ai.ineuron.trail;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 9 };
		int[] arr2 = new int[arr1.length + 1];

		for (int i = arr1.length - 1; i > 0; i--) {
			arr1[i] = arr1[i] + 1;
			if (arr1[i] > 9) {
				int last = arr1[i];
				
				String st = String.valueOf(last);
				int a=st.charAt(0);
			}
		}

		System.out.println(Arrays.toString(arr2));
	}
}
