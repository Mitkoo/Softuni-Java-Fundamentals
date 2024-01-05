import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Integer num = scanner.nextInt();
        Integer product = 0;

        for (int multiplier = 1; multiplier <= 10; multiplier++){
            product= num * multiplier;
            System.out.printf("%d X %d = %d\n", num, multiplier, product);
        }
    }
}
