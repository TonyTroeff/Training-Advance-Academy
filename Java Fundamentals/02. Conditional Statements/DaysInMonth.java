import java.util.Scanner;

/*
От конзолата ще получите едно число - номер на месец от годината.

Изведете на конзолата броя на дните за избрания месец.
Ако избраният месец е февруари, нека резултатът да бъде "28/29".
При невалиден вход, изведете съобщението "Invalid month".

[Вход]
1
[Очакван изход]
31

[Вход]
2
[Очакван изход]
28/29

[Вход]
4
[Очакван изход]
30

[Вход]
13
[Очакван изход]
Invalid month
 */
public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            System.out.println("31");
        else if (month == 4 || month == 6 || month == 9 || month == 11)
            System.out.println("30");
        else if (month == 2)
            System.out.println("28/29");
        else
            System.out.println("Invalid month");
    }
}
