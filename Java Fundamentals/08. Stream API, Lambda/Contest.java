import java.util.*;

/*
От конзолата ще получите на различни редове информация за решените задачи от различни състезания до въвеждане на "end".
Вашата задача е да изведете накрая имената и броя на решените задачи на топ 5 състезанията с най-много решени задачи.
Ако за две състезания имаме равен брой решени задачи, те трябва да бъдат подредени по азбучен ред.

[Вход]
Math is fun -> Problem 1
Math is fun -> Sum large numbers
Programming is fun -> Fibonacci
end
[Очакван изход]
Contest #1: Math is fun, 2 solved problem/s
Contest #2: Programming is fun, 1 solved problem/s

[Вход]
Apples counting -> How many apples are there in a tree
Math is fun -> Problem 1
Math is fun -> Sum large numbers
Programming is fun -> Fibonacci
end
[Очакван изход]
Contest #1: Math is fun, 2 solved problem/s
Contest #2: Apples counting, 1 solved problem/s
Contest #3: Programming is fun, 1 solved problem/s
*/
public class Contest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> problemsByContest = new HashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] data = input.split(" -> ");
            String contest = data[0], problem = data[1];

            if (!problemsByContest.containsKey(contest)) problemsByContest.put(contest, new ArrayList<>());
            problemsByContest.get(contest).add(problem);

            input = scanner.nextLine();
        }

        Comparator<Map.Entry<String, List<String>>> comparator = Comparator.<Map.Entry<String, List<String>>, Integer>comparing(e -> e.getValue().size(), Comparator.reverseOrder())
                .thenComparing(Map.Entry::getKey);
        List<Map.Entry<String, List<String>>> orderedEntries = problemsByContest.entrySet().stream().sorted(comparator).toList();

        for (int i = 0; i < orderedEntries.size(); i++) {
            Map.Entry<String, List<String>> entry = orderedEntries.get(i);
            System.out.printf("Contest #%d: %s, %d solved problem/s%n", i + 1, entry.getKey(), entry.getValue().size());
        }
    }
}
