package JavaPracticeTest;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// input array
		System.out.println("Enter the sum");
		int s = sc.nextInt();
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// sort code
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		
		//main code
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (arr[i]+arr[j] == s) {
					System.out.println(arr[i] + " " + arr[j]);
					return;
				}
				if (i == (n - 1) && j == n - 1 &&  arr[i]+arr[j]!= s) {
					System.out.println("Not Found");
					return;
				}

			}
		}
	}
}
