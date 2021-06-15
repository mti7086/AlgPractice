//항 사이의 증가하는 값이 일정한 비율로 증가하는 수열
// 1+2+4+7+11+16+22+...로 증가하는 수열

package com.test;

public class Sec013 {
	public static void main(String[] args) {
		int i = 0; int j = 1; int k = 1;
		
		do {
			i += 1;
			j += i;
			k += j;
		} while (i < 19);
		
		System.out.printf("%d", k);
	}
}
