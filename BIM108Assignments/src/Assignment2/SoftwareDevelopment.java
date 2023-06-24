package Assignment2;

public class SoftwareDevelopment extends Department {
    private static int number = 0;

    public SoftwareDevelopment(String name, int numberOfWorker) {
        super(name, numberOfWorker);
        number++;
    }

    public static int getNumber() {
        return number;
    }
}

