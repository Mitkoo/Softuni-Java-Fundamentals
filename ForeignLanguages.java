import java.util.*;

public class ForeignLanguages {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();

        Map<String, String> countriesAndLanguages = new HashMap<>();
        countriesAndLanguages.put("England", "English");
        countriesAndLanguages.put("USA", "English");
        countriesAndLanguages.put("Spain", "Spanish");
        countriesAndLanguages.put("Argentina", "Spanish");
        countriesAndLanguages.put("Mexico", "Spanish");

        Optional<String> language = Optional.ofNullable(countriesAndLanguages.get(country));

        if (language.isEmpty()) {
            System.out.println("unknown");
        } else {
            System.out.println(countriesAndLanguages.get(country));
        }
    }
}