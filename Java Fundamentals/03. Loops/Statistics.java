import java.util.Scanner;

/*
Прочетете N числа от конзолата и изведете информация за:
- тяхната сума
- средно аритметично
- произведението на първите три
- най-малкото число
- най-голямото число

[Вход]
10
5
95
71
524
653
-48
97
589
561
792
[Очакван изход]
Sum: 3339
Average: 333.90
Product (of first three numbers): 33725
Min: -48
Max: 792
*/
public class Statistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum = 0, product = 1, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int current = scanner.nextInt();

            sum += current;
            if (i < 3) product *= current;
            if (current < min) min = current;
            if (current > max) max = current;
        }

        System.out.printf("Sum: %d%n", sum);
        System.out.printf("Average: %.2f%n", 1.0 * sum / n);
        System.out.printf("Product (of first three numbers): %d%n", product);
        System.out.printf("Min: %d%n", min);
        System.out.printf("Max: %d%n", max);
    }
}
