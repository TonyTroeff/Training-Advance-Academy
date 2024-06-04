import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
От конзолата ще получите списък с числа (числата са отделени с интервал на един ред).

Вашата задача е да премахнете повтарящите се елементи, да ги подредите във възходящ ред и да ги запишете на конзолата в очаквания формат.

[Вход]
5 9 7 3 1 6
[Очакван изход]
1 < 3 < 5 < 6 < 7 < 9

[Вход]
1 2 1 2 1 2 5
[Очакван изход]
1 < 2 < 5
*/
public class IncreasingSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).toList();
        System.out.println(numbers.stream().distinct().sorted().map(Object::toString).collect(Collectors.joining(" < ")));
    }
}
