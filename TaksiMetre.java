import java.util.Scanner;

public class TaksiMetre {
    public static void main(String[] args) {
        int km;
        Double perKm = 2.20, total;
        Scanner taksi = new Scanner(System.in);
        System.out.println("Mesafeyi Km Cinsinden Giriniz : ");
        km = taksi.nextInt();

        total = (km * perKm);
        System.out.print(total);
    }
}
