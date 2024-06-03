import java.util.Scanner;

public class Power {

    public static int findPower(int x,int y){
        int ans = x;
        for(int i=2;i<=y;i++){
            ans*=x;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base : ");
        int x = sc.nextInt();
        System.out.print("Enter power : ");
        int y = sc.nextInt();
        int ans = findPower(x,y);
        System.out.println("Your answer is "+ans);
    }
}
