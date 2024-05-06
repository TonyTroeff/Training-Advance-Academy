import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
На първите N реда от конзолата ще получите двойка стойности във формата "{symbol} -> {cost}".
След това трябва да прочетете от конзолата текст - ред по ред до въвеждане на "end".

Вашата задача е да изчислите "разхода" за написването на този текст, като той се изчислява по следния начин:
- Сумира се разходът за изписването на всеки един символ.
- Ако разходът за изписване на символа не е известен, приемаме че той е 0.

[Вход]
3
a -> 10
b -> 5
c -> 2
Hello, world!
It is so nice to see you all!
end
[Очакван изход]
12

[Вход]
3
a -> 10
b -> 5
c -> 2
ABBA
end
[Очакван изход]
0

[Вход]
3
a -> 10
b -> 5
c -> 2
abba
california
end
[Очакван изход]
52
*/
public class TextCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<Character, Integer> costBySymbol = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" -> ");
            Character symbol = input[0].charAt(0);
            Integer cost = Integer.parseInt(input[1]);

            costBySymbol.put(symbol, cost);
        }

        int totalCost = 0;

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            for (int i = 0; i < input.length(); i++) {
                Integer cost = costBySymbol.get(input.charAt(i));
                if (cost != null) totalCost += cost;
            }

            input = scanner.nextLine();
        }

        System.out.println(totalCost);
    }
}
