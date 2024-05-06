import java.util.*;
import java.util.stream.Collectors;

/*
От конзолата ще получите два списъка с числа (числата са отделени с интервал на един ред).
Вашата задача е да слеете двата списъка, като вземате число първо от единия списък, а после от другия.
Ако списъците са с различна дължина, в края на сливането взимайте число само от по-дългия списък.

Бележка: Тази задача може да се реши с List, Queue, Deque.

[Вход]
1 3 5 7
2 4 6
[Очакван изход]
1 2 3 4 5 6 7

[Вход]
1 3 5 7
2
[Очакван изход]
1 2 3 5 7

[Вход]
1
2 4 6 8 10
[Очакван изход]
1 2 4 6 8 10
*/
public class MergeLists {
    public static void main(String[] args) {
        solveWithList();
        solveWithDeque();
    }

    private static List<Integer> readList(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).toList();
    }

    private static void solveWithList() {
        Scanner scanner = new Scanner(System.in);

        List<Integer> l1 = readList(scanner), l2 = readList(scanner);
        List<Integer> merge = new ArrayList<>(l1.size() + l2.size());

        int i1 = 0, i2 = 0;
        while (i1 < l1.size() || i2 < l2.size()) {
            if (i1 < l1.size()) {
                merge.add(l1.get(i1));
                i1++;
            }

            if (i2 < l2.size()) {
                merge.add(l2.get(i2));
                i2++;
            }
        }

        System.out.println(merge.stream().map(Object::toString).collect(Collectors.joining(" ")));
    }

    private static Deque<Integer> readDeque(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));
    }

    private static void solveWithDeque() {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> d1 = readDeque(scanner), d2 = readDeque(scanner);
        Deque<Integer> merge = new ArrayDeque<>(d1.size() + d2.size());

        while (!d1.isEmpty() || !d2.isEmpty()) {
            if (!d1.isEmpty()) merge.offer(d1.poll());
            if (!d2.isEmpty()) merge.offer(d2.poll());
        }

        System.out.println(merge.stream().map(Object::toString).collect(Collectors.joining(" ")));
    }
}
