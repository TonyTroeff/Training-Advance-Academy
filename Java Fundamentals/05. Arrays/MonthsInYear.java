import java.util.Scanner;

/*
От конзолата ще получите едно число - номера на търсения месец.
Отпечатайте името на търсения месец, като не може да използвате проверки (освен за валидация на номера).

[Вход]
2
[Очакван изход]
February

[Вход]
4
[Очакван изход]
April

[Вход]
-1
[Очакван изход]
Invalid month!
*/
public class MonthsInYear {
    public static void main(String[] args) {
        String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };

        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();
        if (month < 1 || month > 12) System.out.println("Invalid month!");
        else System.out.println(months[month - 1]);
    }
}
