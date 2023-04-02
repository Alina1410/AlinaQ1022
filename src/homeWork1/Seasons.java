package homeWork1;

import java.util.Scanner;

public class Seasons {
    public void month() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название месяца ");
        String monthName = scanner.nextLine().toLowerCase();

        if (monthName.equals("декабрь") || monthName.equals("январь") || monthName.equals("февраль")) {
            System.out.println("Зима");
        } else if (monthName.equals("март") || monthName.equals("апрель") || monthName.equals("май")) {
            System.out.println("Весна");
        } else if (monthName.equals("июнь") || monthName.equals("июль") || monthName.equals("август")) {
            System.out.println("Лето");
        } else if (monthName.equals("сентябрь") || monthName.equals("октябрь") || monthName.equals("ноябрь")) {
            System.out.println("Осень");
        } else {
            System.out.println("Неверное название месяца");
        }
    }

}

