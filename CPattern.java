package ai.ineuron.trail;

import java.util.Scanner;
public class CPattern {
    public static void main(String[] args) {
        int rows = 6;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (i == 1 || i == rows || j == 1 && j>1 || i<rows-2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
