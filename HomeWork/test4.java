import java.util.Scanner;

public class test4 {
    public static void main(String[] args)  {
        int yyyy, mm, dd;
        Scanner input = new Scanner(System.in);
        yyyy = input.nextInt();
        mm = input.nextInt();
        dd = input.nextInt();
        if(mm <= 2) {mm += 12; yyyy -= 1;}
        int century = yyyy / 100 +1;
        int y_in_c = yyyy-((int)yyyy/100)*100+1;
        int weekday = (int) (dd + 2.6*(mm + 1) + 0.25*(21*century + 5*y_in_c))%7;
        System.out.print("Day of the week is ");
        switch(weekday){
            case 0:System.out.print("Saturday");break;
            case 1:System.out.print("Sunday");break;
            case 2:System.out.print("Monday");break;
            case 3:System.out.print("Tuesday");break;
            case 4:System.out.print("Wednesday");break;
            case 5:System.out.print("Thursday");break;
            case 6:System.out.print("Friday");break;
        }
    }
}
