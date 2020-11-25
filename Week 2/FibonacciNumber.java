import java.util.Scanner;

/**
 * @author Adarsh Agrawal
 *
 */
public class FibonacciNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fibonacci(n));

	}
	static int fibonacci(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		int []fib = new int[n+1];
		fib[0] = 0;
		fib[1] = 1;
		for(int i=2;i<=n;i++) {
			fib[i] = fib[i-1]+fib[i-2];
		}
		return fib[n];
	}

}
