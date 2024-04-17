import java.util.Scanner;

/*
От конзолата ще получите едно число.
Запишете на конзолата:
- "1", ако числото е едноцифрено
- "2/3", ако числото е двуцифрено или трицифрено
- "4/5", ако числото е четирицифрено или петцифрено
- "6 or more", ако числото се състои от 6 или повече цифри
- "-", ако числото е отрицателно

За целта използвайте само серия от проверки.

[Вход]
42
[Очакван изход]
2/3

[Вход]
85561
[Очакван изход]
4/5

[Вход]
-64782
[Очакван изход]
-
*/

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num < 0) System.out.println('-');
        else if (num < 10) System.out.println('1');
        else if (num < 1000) System.out.println("2/3");
        else if (num < 100000) System.out.println("4/5");
        else System.out.println("6 or more");
    }
}
