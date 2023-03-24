package JavaPracticeTest;
import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		System.out.println("Enter the sum");
		int s = sc.nextInt();
		int arr[] = new int [n];
		System.out.println("Enter the array");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int size=0;
		for(int i=0;i<n;i++) {
			int sum = 0;
			for(int j=i;j<n;j++) {
				sum = sum+arr[j];
				if(sum==s) {
					if(j-i+1>=size) {
						size = j-i+1;
					}
				}
				if(i==n-1 && j==n-1 && size==0) {
					System.out.println("Sum not found");
					return;
				}
			}
		}
		System.out.println("Max size is "+size);
	}
		
}


