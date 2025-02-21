//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//Market kasa programı
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        System.out.println("\nHOŞGELDİNİZ.");

        while (true) {
            System.out.println("\nÜrün Listesi");
            System.out.println("1. Ekmek (10TL)");
            System.out.println("2. Balık (50TL)");
            System.out.println("3. Yumurta (35TL)");
            System.out.println("4. Alışverişi bitir.");
            System.out.print("Seçim yapınız: ");
            int choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    total += 10;
                    System.out.println("Ekmek sepete eklendi. Toplam tutar " + total + "TL");
                    break;
                case 2:
                    total += 50;
                    System.out.println("Balık sepete eklendi. Toplam tutar " + total + "TL");
                    break;
                case 3:
                    total += 35;
                    System.out.println("Yumurta sepete eklendi. Toplam tutar " + total + "TL");
                    break;
                case 4:
                    String evet= "evet";
                    String hayır= "hayır";
                    System.out.println("Toplam tutar: " + total + "TL");
                    System.out.println("İndirim kuponunuz var mı?");
                    String answer= scanner.next();

                    if (answer.equals(evet)) {
                        total *= 0.9;
                        System.out.println("Ödeyeceğiniz tutar: " + total + "TL");
                    } else {
                        System.out.println("Ödeyeceğiniz tutar: " + total + "TL");
                    }
                    return;
                default:
                    System.out.println("Seçim başarısız.");
            }
        }
    }

    }
