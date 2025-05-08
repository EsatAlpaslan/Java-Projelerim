import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sayiBulmaca();
    }

    public static void sayiBulmaca() {
        int[] sayilar = new int[]{1, 2, 35, 7, 9, 0};
        System.out.println("Lütfen aranacak sayıyı giriniz");
        Scanner klavye = new Scanner(System.in);
        int aranacak = klavye.nextInt();
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }

        if (varMi) {
           mesajVer("Sayı sistemde mevcut değildir: "+ aranacak);
        } else {
           mesajVer("Sayı sistemde mevcut değildir: "+ aranacak);      }
    }
    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}

