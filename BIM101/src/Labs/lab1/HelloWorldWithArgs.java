package Labs.lab1;

public class HelloWorldWithArgs {

	public static void main(String[] args) {
		
		if (args.length > 0) {
            for (int i=0; i< args.length; i++) {
                System.out.printf("args[%d] = %s\n", i, args[i]);
            }
        }
        else {
            System.out.println("Hello World!");
        }

	}

}
