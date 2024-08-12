import java.util.Scanner;
public class UsAlma {
    public static int power(int base, int exponent) {
        if (exponent == 0) { // Temel durum
            return 1;
        } else if (exponent > 0) {
            return base * power(base, exponent - 1);
        } else {

            return 1 / power(base, -exponent);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Tabanı girin : ");
        int base = scanner.nextInt();

        System.out.print("Üs değerini girin : ");
        int exponent = scanner.nextInt();


        int result = power(base, exponent);


        System.out.println("Sonuç: " + result);

        scanner.close();
    }
}

