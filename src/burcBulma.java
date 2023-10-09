import java.util.Scanner;
public class burcBulma {
    public static void main(String[] args) {
        String month;
        int day;

        Scanner inp = new Scanner(System.in);
        System.out.print("Doğduğunuz ay: ");
        month = inp.nextLine();

        System.out.print("Doğduğunuz gün: ");
        day = inp.nextInt();

        if (month.equals("ocak")){
            if(day < 22){
                System.out.println("Oğlak burcu.");
            }else System.out.println("Kova burcu.");
        } else if (month.equals("şubat")) {
            if(day < 20){
                System.out.println("Kova burcu.");
            }
            else System.out.println("Balık burcu.");
        } else if (month.equals("mart")) {
            if (day < 21){
                System.out.println("Balık burcu.");
            }
            else System.out.println("Koç burcu");
        } else if (month.equals("nisan")) {
            if(day < 21){
                System.out.println("Koç burcu.");
            }
            else System.out.println("Boğa burcu.");
        } else if (month.equals("mayıs")) {
            if (day < 22){
                System.out.println("Boğa burcu.");
            }
            else System.out.println("İkizler burcu.");
        } else if (month.equals("haziran")) {
            if(day < 23){
                System.out.println("İkizler burcu.");
            }
            else System.out.println("Yengeç burcu.");
        } else if (month.equals("temmuz")) {
            if (day < 23){
                System.out.println("Yengeç burcu.");
            }
            else System.out.println("Aslan burcu.");
        } else if (month.equals("ağustos")) {
            if (day < 23){
                System.out.println("Aslan burcu.");
            }
            else System.out.println("Başak burcu.");
        } else if (month.equals("eylül")) {
            if (day < 23){
                System.out.println("Başak burcu.");
            }
            else System.out.println("Terazi burcu.");
        } else if (month.equals("ekim")) {
            if (day < 23){
                System.out.println("Terazi burcu");
            }
            else System.out.println("Akrep burcu.");
        } else if (month.equals("kasım")) {
            if (day < 22){
                System.out.println("Akrep burcu.");
            }
            else System.out.println("Yay burcu.");
        } else if (month.equals("aralık")) {
            if (day < 22){
                System.out.println("Yay burcu.");
            }
            else System.out.println("oğlak burcu.");
        }
    }
}
