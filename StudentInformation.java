import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        Integer age = scanner.nextInt();
        Double grade = scanner.nextDouble();

        System.out.printf("Name: %s, Age: %d, Grade: %.2f", name, age, grade);

    }
}
