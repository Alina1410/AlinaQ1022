package homeWork2;

public class Difference {
    public void diff() {
        int[] arr = {15, 27, 3, 48, -9, 11};
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                even += arr[i];
            } else {
                odd += arr[i];
            }
        }
        int difference = even - odd;
        System.out.println("Разница между четными и нечетными элементами равна " + difference);
    }
}
