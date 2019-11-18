package Termin3;

import java.util.Scanner;

public class UngeradeZahlen {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Gib eine Zahl ein");

		rekursion(scanner.nextInt());

		scanner.close();
	}
	
	public static void printOddNumbers(int n) {
		for (int i = 1; i <= n; i+=2) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void rekursion(int n) {
		if (n != 1) {
			rekursion(n - 2);
		}
		System.out.print(n + " ");
	}
}
