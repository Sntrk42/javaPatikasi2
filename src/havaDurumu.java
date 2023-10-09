import java.util.Scanner;
public class havaDurumu {
    public static void main(String[] args) {
        double temprature;

        Scanner inp = new Scanner(System.in);
        System.out.println("Bugün hava kaç derece?");
        temprature = inp.nextDouble();

        if(temprature < 5){
            System.out.println("Bugün kayak yapmalısın.");
        }
        else if (temprature >= 5 && temprature <= 15){
            System.out.println("Bugün sinemaya gitmelisin.");
        }
        else if (temprature > 15 && temprature < 25) {
            System.out.println("Bugün piknik yapmalısın.");
        }
        else if (temprature >= 25) {
            System.out.println("Bugün yüzmelisin.");
        }
    }
}
