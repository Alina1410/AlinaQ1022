package homeWork1;
import java.util.Scanner;

public class LetterIf {
    public void operatorIf() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите английскую букву ");
        String latter = scanner.nextLine();
        if (latter.equals("a") || latter.equals("A") || latter.equals("e") || latter.equals("E")
                || latter.equals("i") || latter.equals("I") || latter.equals("o") || latter.equals("O")
                || latter.equals("u") || latter.equals("U") || latter.equals("y") || latter.equals("U")) {
            System.out.println("Вы ввели гласную букву");
        } else {
            System.out.println("Вы ввели согласную букву");
        }
    }
}
