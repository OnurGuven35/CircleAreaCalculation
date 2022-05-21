import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        double r, pi = 3.14, alan, cevre;

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen Dairenin Yaricapini Giriniz : ");
        r = input.nextDouble();

        alan = pi * r * r;
        cevre = 2 * pi * r;

        System.out.println("Dairenin Alani : " + alan);
        System.out.print("Dairenin Cevresi : " + cevre);
    }
}
