import java.util.Scanner;

public class Vacation {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int groupNumber = scanner.nextInt();
        String type = scanner.next();
        String dayOfWeek = scanner.next();
        Double price = 0.00;

        if (type.equals("Students") && dayOfWeek.equals("Friday")) {
            price = 8.45;
        } else if (type.equals("Students") && dayOfWeek.equals("Saturday")) {
            price = 9.80;
        } else if (type.equals("Students") && dayOfWeek.equals("Sunday")) {
            price = 10.46;
        } else if (type.equals("Business") && dayOfWeek.equals("Friday")) {
            price = 10.90;
        } else if (type.equals("Business") && dayOfWeek.equals("Saturday")) {
            price = 15.60;
        } else if (type.equals("Business") && dayOfWeek.equals("Sunday")) {
            price = 16.00;
        } else if (type.equals("Regular") && dayOfWeek.equals("Friday")) {
            price = 15.00;
        } else if (type.equals("Regular") && dayOfWeek.equals("Saturday")) {
            price = 20.00;
        } else if (type.equals("Regular") && dayOfWeek.equals("Sunday")) {
            price = 22.50;
        }

        double discount = 0.0;

        if (type.equals("Students") && groupNumber >= 30) {
            discount = 0.15;
        } else if (type.equals("Business") && groupNumber >= 100) {
            groupNumber -= 10;
        } else if (type.equals("Regular") && (groupNumber >= 10 && groupNumber <= 20)) {
            discount = 0.05;
        }

        double Total = groupNumber * price * (1 - discount);
        System.out.printf("Total price: %.2f", Total);
    }
}
