package homeWork3;

import java.util.Arrays;

public class ArrayClass {
    private int[] sorArray(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public void printSortArray(int[] arr) {
        System.out.println("Отсортированный массив: " + Arrays.toString(sorArray(arr)));
    }

    private int findeMaxValue(int[] arr) {
        sorArray(arr);
        int maxValue = arr[arr.length - 1];
        return arr[arr.length - 1];
    }

    public void printMaxValue(int[] arr) {
        System.out.println("Максимальный элемент массива равен " + findeMaxValue(arr));

    }

    private int findeMinValue(int[] arr) {
        sorArray(arr);
        return arr[0];
    }

    public void printMinValue(int[] arr) {
        System.out.println("Минимальный элемент массива равен " + findeMinValue(arr));
    }


    private int findeElementByIndex(int[] arr, int index) {
        int element = 0;
        for (int i = 0; i < index + 1; i++) {
            element = arr[index];
        }
        return element;

    }

    public void printElement(int[] arr, int index) {
        try {
            System.out.println("Элемент массива с индексом " + index +
                    " равен " + findeElementByIndex(arr, index));
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("В массиве нет такого элемента");
        }
    }

    private double divisionEvenOdd(int [] arr) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                even += arr[i];
            } else {
                odd += arr[i];
            }
        }

        double divin = (double) even / odd;
        return divin;

    }

    public void printDivinEvenOdd(int[] arr) {

        System.out.println("Результат деления элементов под четным индексом на элементы" +
                " под нечетным индексом равен " + divisionEvenOdd(arr));
    }

}


