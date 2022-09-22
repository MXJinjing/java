import java.util.Scanner;

public class TESTSCAN1 {
    private static Scanner reader;

    public static void main(String[] args) throws Exception {
    reader = new Scanner(System.in);
    Double x = reader.nextDouble();
    System.out.printf("x: %f\n", x);
    }
    
}
