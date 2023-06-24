package Assignment1;

public abstract class BasicCalculator {
		
	// Returns the summation of number_1 and number_2 => number_1 + number_2
    public int summation(int number_1, int number_2){
        return number_1+number_2;
    }

    // Returns the result of subtracting the number 2 from the number 1 => number_1 - number_2
    public int subtraction(int number_1, int number_2){
        return number_1-number_2;
    }

    // Returns the multiplication of number_1 and number_2 => number_1 * number_2
    public int multiplication(int number_1, int number_2){
        return number_1*number_2; 
    }

    // Returns number_1 divided by number_2 => number_1/number_2
    public double division(int number_1, int number_2){
    	return number_1/number_2; 
    }

    // abstract methot
    public abstract int summation(int[] arr);

    // abstract methot
    public abstract int pow(int number_1, int number_2);

    // abstract methot
    public abstract int fibonacci(int index);

    // abstract methot
    public abstract int factorial(int number);

    // abstract methot
    public abstract int min(int[] arr);

    // abstract methot
    public abstract int max(int[] arr);
}
