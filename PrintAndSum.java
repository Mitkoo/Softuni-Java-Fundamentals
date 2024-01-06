import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int total = 0;

        for (int Num = start; Num <= end; Num++){
            total += Num;
            System.out.print(Num + " ");
        }
        System.out.println("\nSum: " + total);
    }
}
