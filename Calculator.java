import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz:");
        double n1 = input.nextInt();
        System.out.println("İkinci sayıyı giriniz:");
        double n2 = input.nextInt();


        System.out.println("Yapılmasını istediğiniz işlemi seçiniz:");
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        int selection = input.nextInt();
        double division = n1/n2;
        if (selection == 1) {
            System.out.println("Toplam: " + (n1 + n2));
        } else if (selection == 2) {
            System.out.println("Çıkarma: " + (n1 - n2));
        } else if (selection == 3) {
            System.out.println("Çarpım: " + (n1 * n2));
        } else if (selection == 4) {
            if (n2 != 0) {
                System.out.println("Bölüm: " + division);
            } else {
                System.out.println("Bir sayı 0'a bölünemez.");
            }
        } else {
            System.out.println("Yanlış seçim yaptınız, tekrar deneyiniz.");
        }
    }



}
