package homeWork1;

import java.util.Scanner;

public class LetterSwitch {
    public void operatorSwitch() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите букву английскую букву ");
        String letter = scanner.nextLine();
        switch (letter) {
            case "a":
            case "A":
            case "e":
            case "E":
            case "i":
            case "I":
            case "o":
            case "O":
            case "u":
            case "U":
            case "y":
            case "Y":
                System.out.println("Вы ввели гласную букву");
                break;
            default:
                System.out.println("Вы ввели согласную букву");
        }
    }
}