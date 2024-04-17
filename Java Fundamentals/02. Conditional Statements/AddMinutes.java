/*
На първите два реда от конзолата ще получите валидни час и минути (0 <= часове < 24, 0 <= минути < 60).
На третия ред от конзолата ще получите още едно число - броят на минутите, които трябва да прибавите.

След като изчислите новото време, запишете го на конзолата, както е показано в примерите (с водеща нула за минутите).
Бележка: Внимавайте със случаите, в които след прибавяне на минутите, се превърта часа или денонощието.

[Вход]
10
50
5
[Очакван изход]
10:55

[Вход]
8
49
12
[Очакван изход]
09:01

[Вход]
15
01
119
[Очакван изход]
17:00

[Вход]
23
00
60
[Очакван изход]
00:00
*/

import java.util.Scanner;

public class AddMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        int addition = scanner.nextInt();

        // First approach:
        // int newHours = (hours + (minutes + addition) / 60) % 24;
        // int newMinutes = (minutes + addition) % 60;

        // Second approach:
        int total = hours * 60 + minutes + addition;
        int newHours = (total / 60) % 24;
        int newMinutes = total % 60;

        System.out.printf("%02d:%02d%n", newHours, newMinutes);
    }
}
