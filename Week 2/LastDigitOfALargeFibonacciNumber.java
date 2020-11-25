import java.util.Scanner;

/**
 * @author Adarsh Agrawal
 *
 */
public class LastDigitOfALargeFibonacciNumber {

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
		int []fib = new int[n+1];
		fib[0] = 0;
		fib[1] = 1;
		for(int i=2;i<=n;i++) {
			fib[i] = (fib[i-1]+fib[i-2])%10;
		}
		return fib[n];
	}

}
