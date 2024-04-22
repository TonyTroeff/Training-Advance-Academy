import java.util.Scanner;

/*
Реализирайте два метода:
- min(int a, int b) -> връща по-малкото от двете числа.
- max(int a, int b) -> връща по-голямото от двете числа.

Помислете как можем да използваме тези два метода (без да променяме сигнатурата им), за да открием най-малкото (или съответно най-голямото) от N числа.
*/
public class Mathematics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();

        System.out.printf("Max: %d%n", max(max(a, b), c));
        System.out.printf("Min: %d%n", min(min(a, b), c));
    }

    public static int max(int a, int b) {
        if (a > b) return a;
        else return b;
    }

    public static int min(int a, int b) {
        if (a < b) return a;
        else return b;
    }
}
