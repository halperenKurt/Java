package Assignment1;

public class ScientificCalculator extends BasicCalculator{
	
	@Override
    public int summation(int[] arr) {
    	int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; 
        }
        return sum;
    }

    @Override
    public int pow(int number_1, int number_2) {
    	 int result = 1;
         for (int i = 0; i < number_2; i++) {
             result *= number_1; 
         }
         return result;
    }

    @Override
    public int fibonacci(int index) {
    	if(index<=1)
    		return index;
    	int a=0;
    	int b=1;
    	for(int i=2;i<index;i++) {
    		int temp=b;
    		b=b+a;
    		a=temp;
    	}
    	return b;
    }
   
    @Override
    public int factorial(int number) {
    	int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i; 
        }
        return fact;
    }
    
    @Override
    public int min(int[] arr) {
    	int min = Integer.MAX_VALUE;

        for (int a: arr) {
            if (a < min) {
                min = a;
            }
        }
        return min;
    }
    @Override
    public int max(int[] arr) {
    	int max = Integer.MIN_VALUE;
    	for (int a: arr) {
            if (a > max) {
                max = a;
            }
        }
        return max;
    }
}
