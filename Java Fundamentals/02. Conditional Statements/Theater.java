import java.util.Scanner;

/*
На първия ред от конзолата ще получите име на театрална постановка.
На втория ред от кондолата ще получите вида на закупените билети.
На третия ред от конзолата ще получите броя на закупените билети.

Според политиката на театъра, ако сте закупили 10 или повече билета, може да ползвате отстъпка от 5%.

Запишете на конзолата крайната цена, ако използвате следното разпределение на цените на билетите.
+------------+--------------+--------+----------------+
|            | Осъдени души | Бащата | Духът на поета |
+------------+--------------+--------+----------------+
| Балкон     |           20 |     15 |             30 |
| Стандартен |           30 |     40 |             50 |
| VIP        |          100 |    200 |             90 |
+------------+--------------+--------+----------------+

[Вход]
Осъдени души
Балкон
5
[Очакван изход]
100.00

[Вход]
Духът на поета
Стандартен
3
[Очакван изход]
150.00

[Вход]
Бащата
VIP
15
[Очакван изход]
2850.00

[Вход]
Бащата
Балкон
11
[Очакван изход]
156.75
*/
public class Theater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String production = scanner.nextLine();
        String ticketsType = scanner.nextLine();
        double ticketsCount = scanner.nextDouble();

        double baseTicketPrice = 0;
        if (production.equals("Осъдени души")){
            if (ticketsType.equals("Балкон")) baseTicketPrice = 20;
            else if (ticketsType.equals("Стандартен")) baseTicketPrice = 30;
            else if (ticketsType.equals("VIP")) baseTicketPrice = 100;
        } else if (production.equals("Бащата")) {
            if (ticketsType.equals("Балкон")) baseTicketPrice = 15;
            else if (ticketsType.equals("Стандартен")) baseTicketPrice = 40;
            else if (ticketsType.equals("VIP")) baseTicketPrice = 200;
        } else if (production.equals("Духът на поета")) {
            if (ticketsType.equals("Балкон")) baseTicketPrice = 30;
            else if (ticketsType.equals("Стандартен")) baseTicketPrice = 50;
            else if (ticketsType.equals("VIP")) baseTicketPrice = 90;
        }

        double totalPrice = ticketsCount * baseTicketPrice;
        if (ticketsCount >= 10) totalPrice *= 0.95;

        System.out.printf("Total costs: %.2f", totalPrice);
    }
}
