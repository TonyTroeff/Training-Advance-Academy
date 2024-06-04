import java.util.Arrays;
import java.util.Scanner;

/*
От конзолата ще получите едно число N > 2.
Създайте масив с дължина N, в който трябва да изчислите и да запазите числата от редицата на Fibonacci.
- F[0] = 0 (първото число от редицата е 0)
- F[1] = 1 (второто число от редицата е 1)
- F[t] = F[t - 1] + F[t - 2] (стойността на всяко следващо число e сумата от предишните две)

[Вход]
10
[Очакван изход]
0 1 1 2 3 5 8 13 21 34
*/
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < n; i++) fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];

        System.out.println(Arrays.toString(fibonacci));
    }
}
