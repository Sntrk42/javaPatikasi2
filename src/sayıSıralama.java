import java.util.Scanner;
public class sayıSıralama {
    public static void main(String[] args) {
        int number1, number2, number3;

        Scanner inp = new Scanner(System.in);

        System.out.print("1.Sayıyı giriniz: ");
        number1 = inp.nextInt();

        System.out.print("2.Sayıyı giriniz: ");
        number2 = inp.nextInt();

        System.out.print("3.Sayıyı giriniz: ");
        number3 = inp.nextInt();

        if((number1 < number2) && (number1 < number3)){
            if(number2 < number3){
                System.out.println("number1 < number2 < number3:");
            }
            else{
                System.out.println("number1 < number3 < number2");
            }
        }
        else if((number2 < number1) && (number2 < number3)){
            if(number1 < number3){
                System.out.println("number2 < number3 < number1:");
            }
            else{
                System.out.println("number2 < number1 < number3");
            }
        }
        else {
            if(number1 < number2){
                System.out.println("number3 < number1 < number2:");
            }
            else{
                System.out.println("number3 < number2 < number1");
            }
        }
    }
}
