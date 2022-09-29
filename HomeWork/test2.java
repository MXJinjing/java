import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        int letter = 0, space = 0, number = 0, other = 0;
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        char[] c = sentence.toCharArray();

        for (int i = 0; i < c.length; i++) {
            if (c[i] >= 'A' && c[i] <= 'Z' || c[i] >= 'a' && c[i] <= 'z')
                letter++;
            else if (c[i] >= '0' && c[i] <= '9')
                number++;
            else if (c[i] == ' ')
                space++;
            else
                other++;
        }
        System.out.printf("英文字母:%d空格:%d数字:%d其他:%d",letter,space,number,other);
    }
}