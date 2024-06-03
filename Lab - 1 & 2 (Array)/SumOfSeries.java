import java.util.Scanner;

public class SumOfSeries {
    public static int findSum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                sum+=j;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int sum = findSum(n);
        System.out.println("Sum is "+sum);
    }
}
