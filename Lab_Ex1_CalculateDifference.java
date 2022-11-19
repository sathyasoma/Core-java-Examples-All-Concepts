package akash.lab1;

import java.util.Scanner;

public class Lab_Ex1_CalculateDifference {

	
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n, res;
		n = sc.nextInt();
		res = CalculateDifference(n);
		System.out.println(res);

	}

	private static int CalculateDifference(int n) {
		// TODO Auto-generated method stub
		int i, sum = 0, sum1 = 0;
		for (i = 1; i <= n; i++) {
			sum += i * i;
			sum1 += i;
		}
		int s = sum1 * sum1;
		return sum - s;
	}
}
