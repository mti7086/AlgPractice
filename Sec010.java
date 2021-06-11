//정처기 2019 수열 1+2+...+100까지 합계 수열 알고리즘

package com.test;


public class Sec010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		
		i = 0; j = 0;
		do {
			i++;
			j += i;
		} while(i<100);
		
		System.out.printf("%d, %d", i, j);
	}

}
