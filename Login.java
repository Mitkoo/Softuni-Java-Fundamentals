import java.util.Scanner;

import static java.lang.System.in;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String user = scanner.nextLine();
        int counter = 0;

        while (scanner.hasNext()) {
            counter += 1;
            String password = scanner.nextLine();
            StringBuilder sb = new StringBuilder(password);
            String reversedUser = sb.reverse().toString();

            if (counter > 3){
                System.out.printf("User %s blocked!", user);
                break;
            }

            if (user.equals(reversedUser)) {
                System.out.printf("User %s logged in.", user);
                break;
            } else {
                System.out.print("Incorrect password. Try again.\n");
            }
        }
    }
}
