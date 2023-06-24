import java.util.Scanner;

public class FizzBuzz {
	
	public static int FindFizzBuzz(int x) {
		if((x%3==0)&&(x%5==0)) {
			System.out.println(x+" = FIZZBUZZ!!!");
		}
		else if((x%3==0)&&(x%5!=0)) {
			System.out.println(x+ " = FIZZ!!!");
		}
		else if((x%5==0)&&(x%3!=0)) {
			System.out.println(x+" = BUZZ!!!");
		}
		else {
			System.out.println("INVALID!!!");
		}
		return x;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("FIZZ, BUZZ OR FIZZBUZZ");
		int x = scanner.nextInt();
		
		FindFizzBuzz(x);
	
	}

}
