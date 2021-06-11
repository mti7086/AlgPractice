//순서에 의한 반복 계산 1-2+3-4+...-98+99까지의 합계

package com.test;

public class Sec011_2 {
	public static void main(String[] args) {
		int i = 0; int j = 0;
		while(true) {
			i++;
			j+=i;
			
			if(i>=99) {
				System.out.printf("%d", j);
				break;
			}
			
			else {
				i++;
				j-=i;
			}
		}
	}
}
