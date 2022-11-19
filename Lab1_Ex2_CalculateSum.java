package akash.lab1;

import java.util.Scanner;

public class Lab1_Ex2_CalculateSum {

	private static Scanner sc;

	public static int calculateSum(int n) {
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				//adding the value of i into sum variable
				sum += i;// sum=sum+i;
			}
		}
		return sum;  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		sc = new Scanner(System.in);
		n = sc.nextInt();
		int res = calculateSum(n);
		System.out.println(res);
	}
}
