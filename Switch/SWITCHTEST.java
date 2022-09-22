import java.util.Scanner;

public class SWITCHTEST {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    x = x/10;
    // switch (x) {
    //     case 10: System.out.println("A"); break;
    //     case 9: System.out.println("B"); break;
    //     case 8: System.out.println("C"); break;
    //     case 7: System.out.println("D"); break;
    //     case 6: System.out.println("E"); break;
    //     case 5: System.out.println("F"); break;
    //     case 4: System.out.println("G"); break;
    //     case 3: System.out.println("H"); break;
    //     case 2: System.out.println("I"); break;
    //     case 1: System.out.println("J"); break;
    //     default: System.out.println("Unknown"); break;
    if (x == 10) System.out.println("A");
    else if (x == 9) System.out.println("B");
    else if (x == 8) System.out.println("C");
    else if (x == 7) System.out.println("D");
    else if (x == 6) System.out.println("E");
    else if (x == 5) System.out.println("F");
    else if (x == 4) System.out.println("G");
    else if (x == 3) System.out.println("H");
    else if (x == 2) System.out.println("I");
    else if (x == 1) System.out.println("J");
    else System.out.println("Unknown");
}
}
