//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        String correctPIN= "123456";
        int attempts=3;

        while(attempts>0) {
            System.out.print("PIN kodunu giriniz: ");
            String password = scanner.next();

            if (password.equals(correctPIN)) {
                System.out.println("Giriş başarılı.");
                break;
            }
            else {
                attempts--;
                System.out.println("Hatalı giriş. Kalan hakkınız "+attempts);
            }
            if(attempts==0){
                System.out.println("Hatalı girişlerden dolayı kartınız bloke olmuştur.");
                return;
            }
        }
        while(true){
            System.out.println("MENU");
            System.out.println("1. Bakiye Sorgulama");
            System.out.println("2. Para Yatırma");
            System.out.println("3. Para Çekme");
            System.out.println("4. Çıkış");
            System.out.print("İşlem seçiniz: ");
            int choice= scanner.nextInt();

            double balance= 5000;
            switch (choice){
                case 1:
                    System.out.println("Mevcut bakiyeniz: "+balance);
                    break;
                case 2:
                    System.out.print("Yatırmak istediğiniz miktar: ");
                    double money= scanner.nextDouble();
                    balance+=money;
                    System.out.println("Yeni bakiyeniz: "+ balance);
                    break;
                case 3:
                    System.out.print("Çekmek istediğiniz miktar: ");
                    double take= scanner.nextDouble();
                    if(take>balance){
                        System.out.println("Yetersiz bakiye.");
                    }
                    else{
                    balance-=take;
                    System.out.println("Yeni bakiyeniz: "+balance);}
                    break;
                case 4:
                    System.out.println("Çıkış yapıldı.");
                    return;
                default:
                    System.out.println("Geçersiz seçim.Tekrar deneyin.");

            }
        }
        }
    }
