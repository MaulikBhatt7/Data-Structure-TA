public class Armstrong {

    public static boolean checkArmstring(int n){
        int digits = countDigits(n);
        int sum = 0,temp=n,r;
        while(n>0){
            r=n%10;
            n=n/10;
            sum+=Math.pow(r, digits);
        }
        if(sum==temp){
            return true;
        }
        return false;
    }

    public static int countDigits(int n){
        int count=0;
        while (n>0) {
            n=n/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.print("Armstrong numbers : ");
        for(int i=1;i<=1000;i++){
            boolean flag = checkArmstring(i);
            if(flag){
                System.out.print(i+" ");
            }
        }
           
    }
}
