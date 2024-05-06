import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < numbers.length; i++) {
            int currentElement = numbers[i];

            int index = i;
            while (index > 0
                    && numbers[index - 1] > numbers[index]) {
                numbers[index] = numbers[index - 1];
                index--;
            }

            numbers[index] = currentElement;
        }

        System.out.println(Arrays.toString(numbers));
    }
}
