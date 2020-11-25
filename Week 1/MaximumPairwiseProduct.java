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
		System.out.println(maxProduct(n, arr));

	}
	
	static long maxProduct(long n, long[] arr) {
		Arrays.sort(arr);
		return arr[(int) (n-1)] * arr[(int) (n-2)];
	}

}
