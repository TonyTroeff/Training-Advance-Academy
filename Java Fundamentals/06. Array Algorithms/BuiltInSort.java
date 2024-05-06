import java.util.Arrays;
import java.util.Scanner;

public class BuiltInSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
