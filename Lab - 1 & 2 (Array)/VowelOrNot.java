import java.util.Scanner;

public class VowelOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        String ch = sc.nextLine();
        ch = ch.toLowerCase();
        if(ch.charAt(0)=='a' || ch.charAt(0)=='e' || ch.charAt(0)=='i' || ch.charAt(0)=='o' || ch.charAt(0)=='u'){
            System.out.println("Your character is Vowel.");
        }
        else{
            System.out.println("Your character is not Vowel.");
        }
    }
}
