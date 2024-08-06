import java.util.Scanner;

public class DikUcgendeHipotenus {

    public static void main(String[] args) {

        int a, b;
        double c;
        Scanner ucgen = new Scanner(System.in);
        System.out.println(" 1.Kenarı Giriniz : ");
        a = ucgen.nextInt();

        System.out.println("2.Kenarı Giriniz : ");
        b = ucgen.nextInt();

        c = Math.sqrt((a * a) + (b * b));
        System.out.println("Hipotenüs : " + c);

    }
}