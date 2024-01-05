import java.util.Scanner;

public class MonthPrinter {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Integer month = scanner.nextInt();

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        if (month > 12 || month < 1) {
            System.out.println("Error!");
        } else {
            System.out.println(months[month-1]);
        }
    }

}
