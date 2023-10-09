import java.util.Scanner;
public class sinifGeçmeDurumu {
    public static void main(String[] args) {
        int Matematik, Fizik, Turkce, Kimya, Muzik, lessons = 0, totalLessons = 5;

        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz.");
        Matematik = inp.nextInt();

        System.out.println("Fizik notunuzu giriniz.");
        Fizik = inp.nextInt();

        System.out.println("Turkce notunuzu giriniz.");
        Turkce = inp.nextInt();

        System.out.println("Kimya notunuzu giriniz.");
        Kimya = inp.nextInt();

        System.out.println("Muzik notunuzu giriniz.");
        Muzik = inp.nextInt();

        if (Matematik >= 0 && Matematik <= 100) {
            if (Matematik >= 55) {
                System.out.println("Matematikten geçtiniz.");
                lessons++;
            } else {
                System.out.println("Matematikten geçemediniz.");
            }
        }
        if (Fizik >= 0 && Fizik <= 100) {
            if (Fizik >= 55) {
                System.out.println("Fizik geçtiniz.");
                lessons++;
            } else {
                System.out.println("Fizik geçemediniz.");
            }
        }
        if (Turkce >= 0 && Turkce <= 100) {
            if (Turkce >= 55) {
                System.out.println("Turkce geçtiniz.");
                lessons++;
            } else {
                System.out.println("Turkce geçemediniz.");
            }
        }
        if (Kimya >= 0 && Kimya <= 100) {
            if (Kimya >= 55) {
                System.out.println("Kimya geçtiniz.");
                lessons++;
            } else {
                System.out.println("Kimya geçemediniz.");
            }
        }
        if (Muzik >= 0 && Muzik <= 100) {
            if (Muzik >= 55) {
                System.out.println("Muzik geçtiniz.");
                lessons++;
            } else {
                System.out.println("Muzik geçemediniz.");
            }
        }
        if (lessons == totalLessons){
            System.out.println("Tebrikler sınıfı geçtiniz.");
        }
        else{
            System.out.println("Sınıfta kaldınız.");
        }
    }
}