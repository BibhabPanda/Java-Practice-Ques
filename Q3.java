package JavaPracticeTest;
import java.util.Scanner;
public class Q3 {
	public static int firstElement(int[] arr, int n, int k)
    {
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count >= k) {
                return arr[i];
            }
        }
        return -1;
    }
// 
    public static void main(String[] args)
    {
        int[] arr = { 2,1,1,2,1,2,2};
        int n = arr.length;
        int k = 3;
        System.out.print(firstElement(arr, n, k));
    }

}

