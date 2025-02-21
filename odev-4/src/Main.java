

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ders = 5;
        double total = (double)0.0F;
        double ort = (double)0.0F;
        int count = 0;
        double min = (double)100.0F;
        double max = (double)0.0F;

        for(int var14 = 5; var14 > 0; --var14) {
            System.out.print("Ders notunu giriniz: ");
            double note = scanner.nextDouble();
            total += note;
            if (note < (double)30.0F) {
                ++count;
            }

            if (note <= min) {
                min = note;
            }

            if (note >= max) {
                max = note;
            }
        }

        ort = total / (double)5.0F;
        System.out.println("Not ortalamanız: " + ort);
        if (ort >= (double)50.0F) {
            System.out.println("Sınıfı geçtiniz.");
        } else {
            System.out.println("Sınıfta kaldınız.");
        }

        if (count > 0) {
            System.out.println("Düşük not aldığınız dersler var!");
        }

        System.out.println("En düşük notunuz: " + min);
        System.out.println("En yüksek notunuz: " + max);
    }
}
