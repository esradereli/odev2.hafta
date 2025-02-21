//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = (double)0.0F;
        System.out.println("Restoranımıza hoşgeldiniz!");

        while(true) {
            System.out.println("MENU");
            System.out.println("1. Ana yemekler-1000TL");
            System.out.println("2. Ara sıcaklar-500TL");
            System.out.println("3. Pizzalar-750TL");
            System.out.println("4. Tatlılar-450TL");
            System.out.println("5. İçecekler-150TL");
            System.out.println("6. Siparişi bitir.");
            System.out.print("Yapmak istediğiniz seçim: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    total += (double)1000.0F;
                    System.out.println("Ana yemek siparişiniz alınmıştır.");
                    break;
                case 2:
                    total += (double)500.0F;
                    System.out.println("Ara sıcak siparişiniz alınmıştır.");
                    break;
                case 3:
                    total += (double)750.0F;
                    System.out.println("Pizza siparişiniz alınmıştır.");
                    break;
                case 4:
                    total += (double)450.0F;
                    System.out.println("Tatlı siparişiniz alınmıştır.");
                    break;
                case 5:
                    total += (double)150.0F;
                    System.out.println("İçecek siparişiniz alınmıştır.");
                    break;
                case 6:
                    System.out.println("Siparişiniz tamamlanmıştır.");
                    System.out.println("Toplam hesap: " + total + "TL");
                    return;
                default:
                    System.out.println("Hatalı seçim!");
            }
        }
    }
}
