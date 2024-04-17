import java.util.Scanner;

/*
Прочетете N числа от конзолата.
За всяко ново число отпечатайте на конзолата текущата средно аритметична стойност.

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
5.00
50.00
57.00
173.75
269.60
216.67
199.57
248.25
283.00
333.90
*/
public class RunningAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int current = scanner.nextInt();

            sum += current;
            System.out.printf("%.2f%n", 1.0 * sum / (i + 1));
        }
    }
}
