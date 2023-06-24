package Assignment1;

public class TestAssignment {

	public static void main(String[] args) {
		int grade = 0;
        ScientificCalculator calculator = new ScientificCalculator();

        System.out.println("**********************Testing started**********************");
        int num_1 = 52, num_2 = 26;

        if (calculator.summation(num_1, num_2) == 78) {
            grade += 2;
        }
        if (calculator.subtraction(num_1, num_2) == 26) {
            grade += 2;
        }
        if (calculator.multiplication(num_1, num_2) == 1352) {
            grade += 3;
        }
        if (calculator.division(num_1, num_2) == 2) {
            grade += 3;
        }

        System.out.println("After 4 basic operations your grade is " + grade);

        int[] arr = new int[100];
        int[] arr_2 = new int[100];
        for (int i = 1; i < 100; i++) {
            arr[i] = i * 2;
            arr_2[i] = i + 5;
        }

        if (calculator.summation(arr) == 9900) {
            grade += 5;
        }
        if (calculator.summation(arr_2) == 5445) {
            grade += 5;
        }

        System.out.println("After array summation method your grade is " + grade);

        if (calculator.pow(5, 2) == 25) {
            grade += 5;
        }
        if (calculator.pow(3, 4) == 81) {
            grade += 5;
        }

        System.out.println("After pow method your grade is " + grade);

        if (calculator.fibonacci(6) == 5) {
            grade += 5;
        }
        if (calculator.fibonacci(11) == 55) {
            grade += 5;
        }
        if (calculator.fibonacci(15) == 377) {
            grade += 5;
        }
        if (calculator.fibonacci(20) == 4181) {
            grade += 5;
        }
        
        System.out.println("After fibonacci method your grade is " + grade);

        if (calculator.factorial(5) == 120) {
            grade += 5;
        }
        if (calculator.factorial(8) == 40320) {
            grade += 5;
        }
        if (calculator.factorial(10) == 3628800) {
            grade += 5;
        }
        if (calculator.factorial(7) == 5040) {
            grade += 5;
        }

        System.out.println("After factorial method your grade is " + grade);

        int[] arr_min_max = {365, 218, 556, 357, 856, 278, 100, 69, 86, 99, 1256};

        if (calculator.min(arr_min_max) == 69) {
            grade += 15;
        }
        if (calculator.max(arr_min_max) == 1256) {
            grade += 15;
        }

        System.out.println("After min and max methods your grade is " + grade);

        System.out.println("********************All tests completed********************");

        System.out.println("\nAfter all testing your grade is " + grade);
    }

	}


