import java.util.Scanner;

public class Class {
    public static void main(String[] args) {
        int mat,fzk,turkce,kimya,muzik;

        Scanner sinif = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = sinif.nextInt();
        System.out.print("Fizik Notunuz : ");
        fzk = sinif.nextInt();
        System.out.print("Türkçe Notunuz : ");
        turkce = sinif.nextInt();
        System.out.print("Kimya Notunuz : ");
        kimya = sinif.nextInt();
        System.out.print("Müzik Notunuz : ");
        muzik = sinif.nextInt();

        double avarage = (mat + fzk + turkce + kimya + muzik) /5;
        if (avarage<55){
            System.out.println("Sınıfta Kaldınız");
            System.out.println("Ortalamanız : " + avarage);
        }
        else{
            System.out.println("Tebrikler,sınıfı geçtiniz.");
        }
    }

}
