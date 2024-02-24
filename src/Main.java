
import java.nio.file.LinkPermission;
import java.util.Scanner;
public class Main {


    static boolean isPalindromSayi(int number) {

        int temp = number, reverseNumber = 0, lastNumber;


        while (temp !=0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;

        }
        if (number == reverseNumber) {
            return true;
        } else {
            return false;
        }

    }



    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int n = inp.nextInt();
        String sonuc   = isPalindromSayi(n)?"dogru":"yanlis";
        System.out.println(sonuc);


    }
}
