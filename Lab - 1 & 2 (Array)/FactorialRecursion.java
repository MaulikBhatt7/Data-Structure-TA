import java.util.Scanner;

public class FactorialRecursion {
    public static int findFactorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*findFactorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int fact = findFactorial(n);
        System.out.println("Factorial of "+n+" is "+fact);
    }
}
