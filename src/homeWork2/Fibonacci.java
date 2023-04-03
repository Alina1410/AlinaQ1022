package homeWork2;

public class Fibonacci {
    public void fibonacci() {
        int[] number = new int[15];
        for (int i = 0; i < number.length; i++) {
            if (i < 2) {
                number[i] = 1;
            } else {
                number[i] = number[i - 2] + number[i - 1];
            }
            System.out.println(number[i] + " ");
        }
    }
}
