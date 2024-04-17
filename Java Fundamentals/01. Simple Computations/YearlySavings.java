import java.util.Scanner;

public class YearlySavings {
    public static void main(String[] args) {
        // От конзолата ще получите едно число - заплатата на работник за един месец.
        // За всеки месец от годината той иска да спестява 10% от доходите си.
        // Каква сума ще е събрал след една година?

        Scanner scanner = new Scanner(System.in);
        double salaryPerMonth = Double.parseDouble(scanner.nextLine());

        double savingsPerMonth = salaryPerMonth * 0.1;
        double totalSavings = savingsPerMonth * 12;

        System.out.printf("Answer: %.2f", totalSavings);
    }
}