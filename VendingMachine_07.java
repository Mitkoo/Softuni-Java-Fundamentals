import java.util.HashMap;
import java.util.Scanner;
import static java.lang.System.in;

public class VendingMachine_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);
        Double balance = 0.0;

        String input = scanner.nextLine();
        while (!input.equals("Start")) {
            Double coinIn = Double.parseDouble(input);
            if (coinIn == 0.1 || coinIn == 0.2 || coinIn == 0.5 || coinIn == 1 || coinIn == 2){
                balance += coinIn;
            } else {
                System.out.printf("Cannot accept %.2f\n", coinIn);
            }
            input = scanner.nextLine();
        }

        HashMap<String, Double> productPrices = new HashMap<>();
        productPrices.put("Nuts", 2.0);
        productPrices.put("Water", 0.7);
        productPrices.put("Crisps", 1.5);
        productPrices.put("Soda", 0.8);
        productPrices.put("Coke", 1.0);

        while (scanner.hasNext()) {
            input = scanner.nextLine();
            if (input.equals("End")) {
                break;
            }

            if (productPrices.containsKey(input)) {
                if (balance >= productPrices.get(input)){
                    balance -= productPrices.get(input);
                    System.out.printf("Purchased %s\n", input);
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else {
                System.out.println("Invalid product");
            }
        }
        System.out.printf("Change: %.2f", balance);
    }
}