import java.util.Scanner;

public class FactorialLoop {

    public static int findFactorial(int n){
        int fact=1;
        for(int i=2;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int fact = findFactorial(n);
        System.out.println("Factorial of "+n+" is "+fact);
    }
}
