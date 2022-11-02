import java.nio.charset.Charset;
import java.util.Scanner;

public class testscanner {
    public static void main(String[] args) {
         //查看当前系统的字符编码方式
         System.out.println(Charset.defaultCharset().name());
         //查看当前系统的编码方式
         System.out.println(System.getProperty("file.encoding"));
        System.out.println("测试输入");
        Scanner input = new Scanner(System.in);
        String st = input.next();
        System.out.println(st);
        input.close();
    }
}
