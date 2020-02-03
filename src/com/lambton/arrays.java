package com.lambton;

import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        int number[]=new int[5];
        number[0] =1;
        number[2]=10;
        System.out.println(number.length);

        System.out.println(Arrays.toString(number));

        int array[]={1,6,5,8,7,10};
        Arrays.sort(array);
        System.out.println(array.length);
        System.out.println(Arrays.toString(array));


    }
}
