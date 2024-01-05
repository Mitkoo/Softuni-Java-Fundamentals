import java.util.Scanner;

public class MultiplicationTable2x0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer num = scanner.nextInt();
        Integer multiplierValue = scanner.nextInt();
        Integer product = 0;

        if (multiplierValue <= 10) {
            for (int multiplier = multiplierValue; multiplier <= 10; multiplier++) {
                product = num * multiplier;
                System.out.printf("%d X %d = %d\n", num, multiplier, product);
            }
        } else {
            product = num * multiplierValue;
            System.out.printf("%d X %d = %d\n", num, multiplierValue, product);
        }
    }
}
