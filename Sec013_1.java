//1+3+6+10+15+21+28+... 의 순서로 나열되는 수열의 20번쨰 항까지의 합계를 구하시오.

package com.test;

public class Sec013_1 {
	public static void main(String[] args) {
		int i = 0; int j = 0; int k = 0;
		
		do {
			i++;
			j += i;
			k += j;
		} while (i < 20);
		System.out.printf("%d", k);
	}
}
