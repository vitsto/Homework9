import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //exercise 1
        int[] arr = generateRandomArray();
        int totalSpending = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSpending += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + totalSpending + " рублей");

        //exercise 2
        int minSpending = arr[0];
        int maxSpending = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minSpending) {
                minSpending = arr[i];
                continue;
            }

            if (arr[i] > maxSpending) {
                maxSpending = arr[i];
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + minSpending + " рублей. Максимальная сумма " +
                "трат за день составила " + maxSpending + " рублей");

        //exercise 3
        double averageSpending = (double) totalSpending / arr.length;
        System.out.printf("Средняя сумма трат за месяц составила  %.2f рублей\n", averageSpending);

        //exercise 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }

    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}