import java.util.Scanner;

class TESTSCAN {
    /**
     * @param args
     */
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int[] newint = new int[3];
        for (int i = 0; i < 3; i++) {
            newint[i] = scan.nextInt();
            System.out.println(newint[i]);
        }

        double[] newdouble = new double[3];
        for (int i = 0; i < 3; i++) {
            newdouble[i] = scan.nextDouble();
            System.out.println(newdouble[i]);
        }

        String[] newstring = new String[3];
        for (int i = 0; i < 3; i++) {
            newstring[i] = scan.next();
            System.out.println(newstring[i]);
        }

        String line = scan.nextLine();
        System.out.println(line);
        scan.close();
    }
}
