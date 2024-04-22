import java.util.Scanner;

/*
Напишете метод, който трябва да преброи думите в подадения текст.
Приемете, че в текста няма да има препинателни знаци, а само букви и white-space символи.

[Вход]
Hello world So nice to see you
[Очакван изход]
7

Бонус: Помисете каква логика трябва да добавим, за да може методът да се справя с няколко последователни white-space символи.
*/
public class CountWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        System.out.printf("Count of words: %d%n", countWords(line));
    }

    public static int countWords(String str) {
        if (str.isEmpty()) return 0;

        int result = 0;
        int index = 0;
        while (index < str.length()) {
            while (index < str.length() && str.charAt(index) != ' ') index++;
            result++;

            while (index < str.length() && str.charAt(index) == ' ') index++;
        }

        return result;
    }
}
