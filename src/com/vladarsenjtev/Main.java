package com.vladarsenjtev;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[9];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) - 40;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(square(array)));

    }

    public static int[] square(int[] array) {
        int[] arrayOne = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayOne[i] = (int) Math.pow(array[i], 2);
        }
        return arrayOne;
    }
}
