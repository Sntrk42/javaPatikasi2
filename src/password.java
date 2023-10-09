import java.util.Scanner;
public class password {
    public static void main(String[] args) {
        String userName, password, select, newPass;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adınız: ");
        userName = input.nextLine();

        System.out.print("Şifreniz: ");
        password = input.nextLine();

        if(userName.equals("Patika") && password.equals("password") ){
            System.out.println("Giriş yaptınız.");
        }
        else {
            Scanner inp = new Scanner(System.in);
            System.out.print("Bilgileriniz yanlış. Şifrenizi sıfırlamak ister misiniz? (y/n)");
            select = inp.nextLine();

            if(select.equals("y")){
                Scanner pass = new Scanner((System.in));
                System.out.println("Yeni şifrenizi giriniz (Yeni şifreniz eski şifrenizle aynı olamaz.):");
                newPass = pass.nextLine();
                if(newPass.equals("password")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
                else{
                    System.out.println("Şifre oluşturuldu.");
                }
            }
            else{
                System.out.println("Şifre değiştirilmedi.");
            }
        }
    }
}
