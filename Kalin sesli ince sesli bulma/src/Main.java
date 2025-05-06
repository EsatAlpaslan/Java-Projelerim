import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lütfen sesli harfi giriniz");
        char karakter;
        Scanner klavye = new Scanner(System.in);

        char harf = klavye.next().charAt(0);

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harf");
                break;}
        switch(harf){
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println("İnce sesli harf");
                break;
                default:
                    System.out.println("Sesli harf girmediniz");

        }

    }
}
