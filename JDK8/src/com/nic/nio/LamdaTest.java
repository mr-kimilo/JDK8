package com.nic.nio;

import java.util.Arrays;

public class LamdaTest {
	public static void main(String[] args) {
		String splix = ";";
		Arrays.asList("a","b","c").forEach(e->System.out.print(1 << 13));;
		int num[]={0,3,1,6,2,9,10,22,4,6,8,71,23,12};
		Arrays.asList(num).sort((e1,e2) -> System.out.println(e1));
	}

}
