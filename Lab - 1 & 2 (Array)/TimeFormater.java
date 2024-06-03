import java.util.Scanner;

public class TimeFormater {
    public static void timeFormater(int second){
        int hour = second / 3600;
        second = second % 3600;
        int minute = second / 60;
        second = second % 60;
        System.out.println("Time : "+hour+":"+minute+":"+second);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter seconds : ");
        int second = sc.nextInt();
        timeFormater(second);
    }
}
