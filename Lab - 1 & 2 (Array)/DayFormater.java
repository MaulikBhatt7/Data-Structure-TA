import java.util.Scanner;

public class DayFormater {
    public static void dayFormater(int day){
        int year = day / 365;
        day = day % 365;
        int week = day / 7;
        day = day % 7;
        System.out.println("Format : "+year+" year "+week+" week "+day+" days");
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter days : ");
        int day = sc.nextInt();
        dayFormater(day);
    }
}

