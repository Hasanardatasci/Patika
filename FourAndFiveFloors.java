import java.util.Scanner;

public class FourAndFiveFloors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin : ");
        int n = scanner.nextInt();

        System.out.println(" 4'ün katları:");
        for (int i = 1; i * 4 <= n; i++) {
            System.out.println(4 * i);
        }
    }
}
