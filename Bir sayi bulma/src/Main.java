 import java.util.Scanner;
    public class Main {
    public static void main(String[] args) {

        int[] sayilar = new int[]{1, 2, 35, 7, 9, 0};
        System.out.println("Lütfen aranacak sayıyı giriniz");
        Scanner klavye = new Scanner(System.in);
        int aranacak = klavye.nextInt();
        boolean varMi = false;
        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi= true;
            }}
            if(varMi){
                System.out.println("Sayı sistemde mevcuttur");
            }
            else{
                System.out.println("Sayı sistemde mevcut değildir");
            }


    }}
