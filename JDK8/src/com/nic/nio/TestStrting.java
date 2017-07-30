package com.nic.nio;

import java.util.Arrays;

public class TestStrting {
	public static void main(String[] args) {
		String a = "terst";
		System.out.println(a);
		int []b={1,3,21,45,7,0,4,2,8,3};
		TestStrting.sort(b, 0, 9);
	}
	
	public static void sort(int a[],int left,int right){
		/*
         * Traditional (without sentinel) insertion sort,
         * optimized for server VM, is used in case of
         * the leftmost part.
         */
        for (int i = left, j = i; i < right; j = ++i) {
            int ai = a[i + 1];
            while (ai < a[j]) {
                a[j + 1] = a[j];
                if (j-- == left) {
                    break;
                }
            }
            a[j + 1] = ai;
        }
        System.out.println(Arrays.toString(a));
	}
}
