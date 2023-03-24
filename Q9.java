package JavaPracticeTest;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();

		// Input Array
		int arr[] = new int[n];
		System.out.println("Enter the array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// exceptions
		if (arr.length == 1) {
			System.out.println(arr[0] + " is the equilibrium number");
		} else if (arr.length == 2) {
			System.out.println("No Equilibrium");
		} else {

			int sum1 = 0;
			for (int i = 0; i < n; i++) {
				sum1 += arr[i];
			}

			// main code
			int lsum = 0;
			int rsum = sum1 - arr[0];
			for (int i = 1; i < n; i++) {
				lsum += arr[i - 1];
				rsum -= arr[i];
				if (lsum == rsum) {
					System.out.println(arr[i] + " is the equilibrium number");
					break;
				}
				if (i == n - 1) {
					System.out.println("No Equilibrium");
				}
			}
		}

	}
}
