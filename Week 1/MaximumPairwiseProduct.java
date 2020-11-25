import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Adarsh Agrawal
 *
 */
public class MaximumPairwiseProduct {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long []arr = new long[(int) n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextLong();
		}
		System.out.println(maxProduct2(n, arr));

	}
	// Time complexity O(nlogn)
	static long maxProduct1(long n, long[] arr) {
		Arrays.sort(arr);
		return arr[(int) (n-1)] * arr[(int) (n-2)];
	}
	
	// Time complexity O(n)
	static long maxProduct2(long n, long []arr) {
		
		long max1=0,max2=0;
		int index = 0;
		for(int i=0;i<n;i++) {
			if(arr[i]>max1) {
				max1 = arr[i];
				index = i;
			}
		}
		for(int i=0;i<n;i++) {
			if(arr[i]>max2 && i != index) {
				max2=arr[i];
			}
		}
		
		return max1*max2;
	}

}
