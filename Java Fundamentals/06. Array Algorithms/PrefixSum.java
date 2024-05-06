import java.util.Arrays;
import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int[] prefixSum = new int[numbers.length + 1];

        for (int i = 0; i < numbers.length; i++)
            prefixSum[i + 1] = prefixSum[i] + numbers[i];

        int queries = scanner.nextInt();
        for (int i = 0; i < queries; i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();

            int ans = prefixSum[end] - prefixSum[start - 1];
            System.out.printf("Answer to query #%d: %d%n", i + 1, ans);
        }
    }
}
