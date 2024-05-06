import java.util.*;

/*
От кондолата на един ред ще получите израз, който ще се състои от различни видове скоби.
Вашата задача е да определите дали изразът е "балансиран":
- Отваряща скоба трябва да бъде затворена с друга скоба от същия вид
- Отварящите скоби трябва да бъдат затворени в правилния ред.
- За всяка затваряща скоба трябва да има съответстваща отваряща.

[Вход]
()
[Очакван изход]
Correct!

[Вход]
(]
[Очакван изход]
Incorrect!

[Вход]
[()]
[Очакван изход]
Correct!

[Вход]
[(])
[Очакван изход]
Incorrect!

[Вход]
())
[Очакван изход]
Incorrect!

[Вход]
{[]()()(([])){[][[[]]][[()]]}}
[Очакван изход]
Correct!
*/
public class BalancedParentheses {
    private static boolean isBalanced(String text, Map<Character, Character> parentheses) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < text.length(); i++) {
            if (parentheses.containsKey(text.charAt(i)))
                stack.push(text.charAt(i));
            else {
                if (stack.isEmpty() || parentheses.get(stack.peek()) != text.charAt(i))
                    return false;

                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        Map<Character, Character> parentheses = new HashMap<>();
        parentheses.put('(', ')');
        parentheses.put('[', ']');
        parentheses.put('{', '}');

        if (isBalanced(line, parentheses)) System.out.println("Correct!");
        else System.out.println("Incorrect!");
    }
}
