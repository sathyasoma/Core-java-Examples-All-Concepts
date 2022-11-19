package akash.lab1;

import java.util.Scanner;

public class Lab1_Ex4_checkNumber {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		sc = new Scanner(System.in);
		n = sc.nextInt();
		boolean b = checkNumber(n);
		if (b)
			System.out.println("yes");
		else
			System.out.println("No");

	}

	private static boolean checkNumber(int n) {
		// TODO Auto-generated method stub
		if (n == 0) {
			return false;
		}
		while (n != 1) {
			if (n % 2 != 0) {
				return false;
			}
			n /= 2;
		}

		return true;
	}
}
