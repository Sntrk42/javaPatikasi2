import java.util.Scanner;
public class hesapMakinesi {
    public static void main(String[] args) {
        int number1, number2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("1.Sayıyı giriniz: ");
        number1 = input.nextInt();
        System.out.print("2.Sayıyı giriniz: ");
        number2 = input.nextInt();

        System.out.println("Yapmak istediğiniz işlemi seçiniz:\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");

        Scanner calculation = new Scanner(System.in);
        select = calculation.nextInt();

        switch (select){
            case 1:
                System.out.println("Sonuç: " + (number1 + number2));
                break;
            case 2:
                System.out.println("Sonuç: " + (number1 - number2));
                break;
            case 3:
                System.out.println("Sonuç: " + (number1 * number2));
                break;
            case 4:
                if (number2 == 0) {
                    System.out.println("Bir sayıyı sıfıra bölemezsiniz.");
                } else {
                    System.out.println("Sonuç: " + ((double) number1 / number2));
                }
                break;
            default:
                System.out.println("Geçersiz seçim.");
        }
    }
}
