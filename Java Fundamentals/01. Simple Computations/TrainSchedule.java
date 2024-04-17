import java.util.Scanner;

public class TrainSchedule {
    public static void main(String[] args) {
        // Напишете програма, която изчислява приблизителното време на пристигане за даден влак.
        // От конзолата ще получите три числа:
        // - Пътят (в км), който влакът трябва да измине;
        // - Средната скорост (в км/ч), с която влакът се движи;
        // - Броят спирки.
        //
        // Изчислете времето (в часове), необходимо на влака, за да стигне крайната дестинация, като имате предвид, че всяко едон спиране го забавя допълнително с 15 минути.

        Scanner scanner = new Scanner(System.in);
        double distance = Double.parseDouble(scanner.nextLine());
        double averageSpeed = Double.parseDouble(scanner.nextLine());
        int stops = Integer.parseInt(scanner.nextLine());

        double totalTime = distance / averageSpeed + stops * 0.25;
        System.out.printf("Answer %.2fh", totalTime);
    }
}
