import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        String userName,password;

        Scanner kullanıcı = new Scanner(System.in);

        System.out.println("Kullanıcı Adınız : ");
        userName=kullanıcı.nextLine();
        System.out.println("Şiferniz : ");
        password=kullanıcı.nextLine();

        if(userName.equals("Hasan Arda") && password.equals("hasan101")){
            System.out.println("Giriş Yaptınız (;");
        }
        else{
            System.out.println("Bilgileriniz yanlış !!!");
        }
    }
}
