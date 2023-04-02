package homeWork1;

import java.util.Scanner;

public class Sum {
    public void arithmetic() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите минимальное число: ");
        int number1 = scanner.nextInt();
        System.out.println("Введите максимальное число: ");
        int number2 = scanner.nextInt();

        int sum = 0;
        for (int i = number1 + 1; i < number2; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println("Сумма всех чисел между " + number1 + " и " + number2 +
                ", которые делятся на 3, равна " + sum +".");
    }
}
