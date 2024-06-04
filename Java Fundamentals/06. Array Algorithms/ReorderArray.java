import java.util.Arrays;
import java.util.Scanner;

/*
От конзолата ще получите на един ред масив от числа.
Пренаредете масива, като в началото поставите всички четни числа, а в края - всички нечетни.

Бележка: Не използвайте допълнителни масиви!
Бележка: Не е необходимо да запазите реда на въвеждане.

[Вход]
1 2 3 4 5
[Очакван изход]
2 4 3 1 5
*/
public class ReorderArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int offset = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) offset++;
            else if (offset > 0) {
                int swap = numbers[i];
                numbers[i] = numbers[i - offset];
                numbers[i - offset] = swap;
            }
        }

        System.out.println(Arrays.toString(numbers));
    }
}
