import static java.lang.System.in;
import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        int number = scanner.nextInt();
        int originalNumber = number;
        int factorial = 0;
        int result = 0;

        while (number > 0) {

        int currentNum = number % 10;

        factorial = currentNum;
            for (int j = 1; j < factorial; j++){
                currentNum *= j;
            }
            result += currentNum;
            number = number / 10;
        }

        if (result == originalNumber){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
