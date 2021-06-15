//항이 바뀔 때 마다 빼기와 더하기가 번갈아 나열되는 수열

package com.test;

public class Sec013_2 {
	public static void main(String[] args) {
		int i = 0; int j = 1; int k = -1;
		int sw = -1; //스위치 변수
		
		do {
			i++;
			j += i;
			sw *= -1; // -1 * -1=양수  -1 * 1=음수
			k += (j * sw); // k = k + (J * sw)
		} while (i < 19);
		
		// 첫 번째 항의 값을 합계를 누적할 k에 초기 값으로 치환하여 이미 계산된 것으로 
		// 처리 했기 때문에 첫번 째 항을 제외한 19개의 항을 더하기 위해 i를 19까지만 증가시킨다.
		
		System.out.printf("%d", k);
	}
}
