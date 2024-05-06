import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

/*
От конзолата на един ред ще получите няколко забранени думи.
След това трябва да прочетете от конзолата текст - ред по ред до въвеждане на "end".

Вашата задача е да проверите дали някоя от забранените думи се съдържа в текста.

Бележка: Приемете, че в текста ще липсват пунктуационни знаци и че casing-ът не е от значение.

[Вход]
password salary
It is so nice to see you
We have not met in years
end
[Очакван изход]
No sensitive information here.

[Вход]
password salary
Can you send me you password
I want to log in your account to check something
end
[Очакван изход]
This message contains sensitive information: password.

[Вход]
password salary
Can you send me you password
I want to log in your account to check what is your salary
end
[Очакван изход]
This message contains sensitive information: password, salary.
*/
public class SensitiveInformationChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> forbiddenWords = Arrays.stream(scanner.nextLine().split(" ")).map(String::toLowerCase).collect(Collectors.toSet());
        Set<String> containedWords = new HashSet<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] allWords = Arrays.stream(input.split(" ")).map(String::toLowerCase).toArray(String[]::new);
            for (String word : allWords) {
                if (forbiddenWords.contains(word)) containedWords.add(word);
            }

            input = scanner.nextLine();
        }

        if (containedWords.isEmpty()) System.out.println("No sensitive information here.");
        else System.out.printf("This message contains sensitive information: %s.%n", String.join(", ", containedWords));
    }
}
