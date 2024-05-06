import java.util.*;
import java.util.stream.Collectors;

/*
От конзолата ще получите списък с числа (числата са отделени с интервал на един ред).

Вашата задача е да приложите следните действия върху списъка:
- Вземате първия елемент
- Прибавяте стойността му към останалите
- Премахвате първия елемент
- Обърнете списъка

Играта продължава, докато в списъка не остане едно единствено число.
Запишете на конзолата неговата стойност.

Бележка: Помислете как бихме могли да оптимизираме решението, така че да работи достатъчно бързо за поне 100000 елемента в списъка.
Бележка: Дали може да използваме Deque, за да постигнем тази оптимизация?

[Вход]
1 3 5 7
[Очакван изход]
26
[Обяснение]
1. [1, 3, 5, 7] => [8, 6, 4]
2. [8, 6, 4] => [12, 14]
3. [12, 14] => [26]

[Вход]
10 5 3 9 7
[Очакван изход]
130
*/
public class NumericGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Long> deque = Arrays.stream(scanner.nextLine().split(" ")).map(Long::parseLong).collect(Collectors.toCollection(ArrayDeque::new));

        long result = 0, additive = 0;
        int iterations = deque.size();
        for (int i = 0; i < iterations; i++) {
            long current;
            if (i % 2 == 0) current = deque.removeFirst();
            else current = deque.removeLast();

            result = current + additive;
            additive += result;
        }

        System.out.println(result);
    }
}
