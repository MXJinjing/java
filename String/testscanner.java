import java.util.Scanner;

public class testscanner {
    public static void main(String[] args) {
        System.out.println("测试输入");
        Scanner input = new Scanner(System.in);
        String st = input.next();
        System.out.println(st);
        input.close();
    }
}
