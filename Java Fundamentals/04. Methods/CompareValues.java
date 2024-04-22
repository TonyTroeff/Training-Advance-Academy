/*
От конзолата ще прочетете 6 стойности:
- 2 цели числа
- 2 дробни числа
- 2 думи

Реализирайте методът areEqual, който трябва да има следните overload-и:
- areEqual(int a, int b) -> Ако числата са равни, връща true. В противен случай - false;
- areEqual(double a, double b) -> Ако абсолютната разлика между числата е < 0.00001, връща true. В противен случай - false;
- areEqual(String a, String b) -> Ако думите са еднакви, връща true. В противен случай - false.
*/
public class CompareValues {
    public static void main(String[] args) {
        System.out.println(areEqual(5, 5));
        System.out.println(areEqual(4.99999, 5));
        System.out.println(areEqual("Hello", "world"));
    }

    public static boolean areEqual(int a, int b) {
        return a == b;
    }

    public static boolean areEqual(double a, double b) {
        return Math.abs(a - b) < 0.00001;
    }

    public static boolean areEqual(String a, String b) {
        return a.equals(b);
    }
}
