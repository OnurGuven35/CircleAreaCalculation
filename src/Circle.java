/* Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
Alan Formülü : π * r * r;
Çevre Formülü : 2 * π * r; */

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double r, pi = 3.14, area, perim;

        // Kullanıcıdan değer alıp verilen formüllere göre çevre ve alanı yazdırıyoruz.

        System.out.println();
        System.out.print("Lutfen Dairenin Yaricapini Giriniz : ");
        r = input.nextDouble();

        area = pi * r * r;
        perim = 2 * pi * r;

        System.out.println();
        System.out.println("Dairenin Alani : " + area);
        System.out.println("Dairenin Cevresi : " + perim);
    }
}