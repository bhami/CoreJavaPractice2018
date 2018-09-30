import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Please enter a intege");
		int input = -1;
		while(input != 0){
			input = new Scanner(System.in).nextInt();
			int result = factorial(input);
			System.out.println("factorial of " + input + "=" + result);
		}
	}
	public static int factorial(int n){
		int f = 0;
		int res = 1;
		if (n !=1)
			res = n * factorial(n-1);
		else
			return res;
		return res;
	}

}
