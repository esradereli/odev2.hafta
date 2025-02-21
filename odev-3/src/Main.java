//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//Trafik Cezası
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String limit="90 km/s";
        System.out.print("Hızınızı giriniz(km/s): ");
        double speed= scanner.nextDouble();

        if(speed<=90){
            System.out.println("Cezanız bulunmamaktadır.");
        }
        else if(speed>90 && speed<=110){
            System.out.println("Cezanız: 1000TL");
        }
        else if(speed>110 && speed<=130){
            System.out.println("Cezanız: 2000TL");
        }
        else{
            System.out.println("Fazla hız aşımından ehliyetinize el konulmuştur.");
        }
    }
}