import java.util.Scanner;

/**
 * @author Adarsh Agrawal
 *
 */
public class LeastCommonMultiple {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		long res = ((long)num1*(long)num2)/gcd(num1,num2);
		System.out.println(res);
		sc.close();

	}
	
	static int gcd(int num1, int num2) {
		if(num2 == 0) {
			return num1;
		}else {
			return gcd(num2, num1%num2);
		}
	}

}
