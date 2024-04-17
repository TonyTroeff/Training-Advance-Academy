/*
От първия ред на конзолата ще получите едно число - парите, с които разполагате.

На следващите редове ще получавате информация за всяка едно покупка в следния ред:
- Първо, името на артикула (то ще се състои от една единствена дума и ще бъде уникално)
- Второ, цената за 1 единица от артикула
- Трето, закупеното количеството (може да бъде дробно число - например 1.356кг домати)

Програмата приключва при въвеждане на продукт с име "Enough" или когато свършат парите.

Ако парите са свършили, запишете на конзолата съобщението: "You spent everything"
В противен случай запишете на конзолата: "You are left with {...} lv."

Изведете също така още три неща:
- Името на продукта с най-висока цена (без значение от закупеното количество)
- Името на продукта, чието закупено количество е най-голямо (без значение от цената)
- Името на продукта с най-висока крайна цена

Бележка: В този конкретен случай има една особеност, свързана с начина, по който четем информация от конзолата. За да го ибегнете, при прочитане на името на продукта използвайте scanner.next() вместо scanner.nextLine()
Бележка: На по-ниско ниво типът Double е устроен доста по-различно от типа Integer. Поради тази причина Double.MIN_VALUE не съответства на разбирането ни за най-малка стойност, която може да се съхранява.
Бележка: Възможно е един продукт да спада в една, две или три категории.

[Вход]
100
Tomatoes
3.5
1.356
Cucumbers
1.56
0.678
Enough
[Очакван изход]
You are left with 94.20 lv.
Max price: Tomatoes
Max quantity: Tomatoes
Max total: Tomatoes

[Вход]
15
Chips
5.00
2
Juice
6.25
1
[Очакван изход]
You spent everything
Max price: Juice
Max quantity: Chips
Max total: Chips

[Вход]
20
Gum
0.10
10
Wafer
0.75
2
Snack
1.2
1
Enough
[Очакван изход]
You are left with 16.30 lv.
Max price: Snack
Max quantity: Gum
Max total: Wafer
*/

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = scanner.nextDouble();

        double maxPrice = 0, maxQuantity = 0, maxTotal = 0;
        String productWithMaxPrice = "", productWithMaxQuantity = "", productWithMaxTotal = "";

        String productName = scanner.next();
        while (!productName.equals("Enough")) {
            double price = scanner.nextDouble();
            double quantity = scanner.nextDouble();

            double total = price * quantity;

            if (price > maxPrice) {
                maxPrice = price;
                productWithMaxPrice = productName;
            }

            if (quantity > maxQuantity) {
                maxQuantity = quantity;
                productWithMaxQuantity = productName;
            }

            if (total > maxTotal) {
                maxTotal = total;
                productWithMaxTotal = productName;
            }

            money -= total;
            if (money < 0) {
                break;
            }

            productName = scanner.next();
        }

        if (money < 0) {
            System.out.println("You spent everything");
        } else {
            System.out.printf("You are left with %.2f lv.%n", money);
        }

        System.out.printf("Max price: %s%n", productWithMaxPrice);
        System.out.printf("Max quantity: %s%n", productWithMaxQuantity);
        System.out.printf("Max total: %s%n", productWithMaxTotal);
    }
}
