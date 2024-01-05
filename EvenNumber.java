import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            Integer num = Math.abs(scanner.nextInt());
            if (num % 2 == 0) {
                System.out.println("The number is: " + num);
            } else {
                System.out.println("Please write an even number.");
            }
        }
    }
}