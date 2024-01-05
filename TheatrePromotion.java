import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String typeOfDay = scanner.nextLine();
        Integer age = scanner.nextInt();
        Integer priceUSD = 0;

        if (typeOfDay.equals("Weekday") && (age >= 0 && age <= 18)) {
            priceUSD = 12;
        } else if (typeOfDay.equals("Weekday") && (age > 18 && age <= 64)){
            priceUSD = 18;
        } else if (typeOfDay.equals("Weekday") && (age > 64 && age <= 122)) {
            priceUSD = 12;
        }

        if (typeOfDay.equals("Weekend") && (age >= 0 && age <= 18)) {
            priceUSD = 15;
        } else if (typeOfDay.equals("Weekend") && (age > 18 && age <= 64)){
            priceUSD = 20;
        } else if (typeOfDay.equals("Weekend") && (age > 64 && age <= 122)) {
            priceUSD = 15;
        }

        if (typeOfDay.equals("Holiday") && (age >= 0 && age <= 18)) {
            priceUSD = 5;
        } else if (typeOfDay.equals("Holiday") && (age > 18 && age <= 64)){
            priceUSD = 12;
        } else if (typeOfDay.equals("Holiday") && (age > 64 && age <= 122)) {
            priceUSD = 10;
        }

        if (priceUSD > 0){
            System.out.println(priceUSD + "$");
        } else {
            System.out.println("Error!");
        }
    }
}
