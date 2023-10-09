import java.util.Scanner;

public class biletFiyati {
    public static void main(String[] args) {
        double km, fiyat, topFiyat;
        int yas, yon;

        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi km türünden giriniz: ");
        km = input.nextDouble();

        System.out.println("Yaşınızı giriniz: ");
        yas = input.nextInt();

        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        yon = input.nextInt();

        fiyat = km * 0.10;

        if ((yas > 0) && (km > 0) && (yon == 1 || yon == 2)){
            if (yas < 12){
                topFiyat = fiyat * 0.5;
                if (yon == 2){
                    System.out.println("Toplam Tutar: " + topFiyat * 2);
                }
                else {
                    System.out.println("Toplam Tutar: " + topFiyat);
                }
            } else if ((12 <= yas) && (yas <= 24)) {
                topFiyat = fiyat * 0.90;
                if (yon == 2){
                    System.out.println("Toplam Tutar: " + topFiyat * 2);
                }
                else {
                    System.out.println("Toplam Tutar: " + topFiyat);
                }
            } else if (yas > 65) {
                topFiyat = fiyat * 0.70;
                if (yon == 2){
                    System.out.println("Toplam Tutar: " + topFiyat * 2);
                }
                else {
                    System.out.println("Toplam Tutar: " + topFiyat);
                }
            }
            else{
                if (yon == 2){
                    System.out.println("Toplam Tutar: " + fiyat * 2);
                }
                else {
                    System.out.println("Toplam Tutar: " + fiyat);
                }
            }
        }
        else System.out.println("Hatalı veri girdiniz!");
    }
}
