import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Integer hours = scanner.nextInt();
        Integer minutes = scanner.nextInt();
        String addZero = null;

        Integer controllerMin = minutes + 30;

        if (controllerMin > 59) {
            hours += 1;
            controllerMin -= 60;
        }

        if (controllerMin < 10) {
            addZero = "0";
        }

        if (hours > 23){
            hours = 0;
        }

        if (addZero == "0"){
            System.out.printf("%d:0%d", hours, controllerMin);
        } else {
            System.out.printf("%d:%d", hours, controllerMin);
        }

    }
}
