package JavaPracticeTest;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int N = sc.nextInt();
		System.out.println("Enter the reversing subarray K");
		int K = sc.nextInt();

		// Input Array
		int arr[] = new int[N];
		System.out.println("Enter the array");
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		// reversing the groups
		if ((K % 2) == 0) {
			for (int i = 0; i < N / K; i++) {
				for (int j = 0; j < K; j++) {
					if (((i * K) + j) > ((i + 1) * K - j - 1)) {
						break;
					} else {
						int temp = arr[(i * K) + j];
						arr[(i * K) + j] = arr[(i + 1) * K - j - 1];
						arr[(i + 1) * K - j - 1] = temp;
					}
				}
			}

		}
		else if((K % 2) == 1){
			for (int i = 0; i < N / K; i++) {
				for (int j = 0; j < K; j++) {
					if (((i * K) + j) > ((i + 1) * K - j - 1)) {
						break;
					} else {
						int temp = arr[(i * K) + j];
						arr[(i * K) + j] = arr[(i + 1) * K - j - 1];
						arr[(i + 1) * K - j - 1] = temp;
					}
				}
			}
		}
		
		for(int i=N-(N%K);i<N;i++) {
			for(int j=N-1;j>=N-(N%K);j--) {
				//if((N%K)==0) {
					if(i>j) {
						break;
					}
					if(i==j) {
						break;
					}
					else {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				//}
			}
		}
		
		for (int b : arr) {
			System.out.println(b);
		}
	}

}
