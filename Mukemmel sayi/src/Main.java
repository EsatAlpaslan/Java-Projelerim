import java.util.Scanner;
    public class Main {
    public static void main(String[] args) {

        //Bir sayının bölenleri toplamı o sayıyı veriyorsa bu sayıya "Mükemmel sayı" denir

        System.out.println("Lütfen sayıyı giriniz");
        Scanner klavye =new Scanner(System.in);
        int number = klavye.nextInt();
        int total = 0 ;
        for(int i = 1; i< number; i++){
            if(number % i == 0) {

                total = total + i;
            }}
                if(total== number){
                    System.out.println("Mükemmel sayıdır");
                }
                else{
                    System.out.println("Mükemmel sayı değildir");
                }
            }

        }

