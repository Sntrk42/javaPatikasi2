import java.util.Scanner;

public class artikYil {
    public static void main(String[] args) {
        int year;

        Scanner input = new Scanner(System.in);
        System.out.println("Yıl giriniz: ");
        year = input.nextInt();

        int hundered = year % 100;
        int leap = year % 4;

        if (hundered == 0){
            int remainder = year % 400;
            if (remainder == 0){
                System.out.println(year + " artık bir yıldır!");
            }
        }
        else if (leap == 0){
            System.out.println(year + " artık bir yıldır!");
        }
        else System.out.println(year + " artık bir yıl değildir!");
    }
}
