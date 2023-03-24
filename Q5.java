package JavaPracticeTest;
import java.util.Scanner;
public class Q5 {

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
		
		for(int i=0;i<n;i++) {
			int sum = 0;
			for(int j=i;j<n;j++) {
				sum = sum+arr[j];
				if(sum==s) {
					System.out.println(i+" "+j);
					return;
				}
				if(i==(n-1) && j==n-1 && sum!=s) {
					System.out.println("Not Found");
					return;
				}
			}
		}
		
	}

}
