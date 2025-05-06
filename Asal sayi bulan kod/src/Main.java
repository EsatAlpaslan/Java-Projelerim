import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number;
        System.out.println("Lütfen inceleyeceğiniz sayıyı giriniz");
        Scanner klavye = new Scanner(System.in);
        number = klavye.nextInt();
        boolean isPrime = true;

        if(number==1){
            System.out.println("Asal sayı değildir");
            return;
        }
        if(number<1){
            System.out.println("Geçersiz sayı");
            return;
        }
        for(int i=2; i<number;i++)
        {
            if(number % i == 0){
                isPrime = false;
            }
        }
         if(isPrime){
             System.out.println("Sayı asaldır");
         }
         else{
             System.out.println("Sayı asal değildir");
         }

        }
    }
