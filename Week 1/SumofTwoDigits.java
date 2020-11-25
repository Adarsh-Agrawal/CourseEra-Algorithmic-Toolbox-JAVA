import java.util.Scanner;
/**
 * @author Adarsh Agrawal
 *
 */
public class SumofTwoDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(sumOfDigits(num1, num2));
	}
	
	static int sumOfDigits(int num1, int num2) {
		return num1 + num2;
	}
}
