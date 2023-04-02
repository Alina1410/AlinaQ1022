package homeWork1;
import java.util.Scanner;

public class Exit {
    public void input() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите слово ");
            String word = scanner.nextLine();
            switch (word) {
                case "exit":
                    System.out.println("Программа завершена");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Вы ввели " + word);
                    break;
            }
        }
    }
}
