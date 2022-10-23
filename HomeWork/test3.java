import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        int number[] = new int[20];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < number.length; i++)
            number[i] = input.nextInt();
        Arrays.sort(number);
        for (int i = number.length-1; i >= 0; i--)
            System.out.printf("%d ", number[i]);
    }
}
