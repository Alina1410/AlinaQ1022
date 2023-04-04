package homeWork2;

import java.util.Arrays;

public class SumMinMax {
    public void min_max() {
        int[] arr = {1, 15, -10, 59, 11};
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1] + arr[0]);
    }
}
