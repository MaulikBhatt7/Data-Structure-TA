import java.util.Scanner;

public class Prime {
    public static int checkPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int flag = checkPrime(n);
        if(flag==1){
            System.out.println(n + " is Prime number");
        }
        else{
            System.out.println(n + " is not Prime number");
        }
    }
}
