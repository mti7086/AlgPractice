//수열 -(1/2) + (2/3) - (3/4) + (4/5) - (5/6) + ... - (99/100)

package com.test;

public class Sec012 {
	static double i = 0; static double j = 0;
	
	public double run() {
		
		do {
			i++;
			
			if((int)(i/2) == i / 2) { // i를 2로 나눈 정수의 결과와 i를 2를 나눈 값이 같으면 분자는 짝수다.
				// (int)(3/2)= 1 , 3/2 = 1.5 다르다. 즉 분자는 홀수다.
				
				// 분자가 짝수 일 때는 누적 된 값에서 더한다.
				j += i / (i + 1);
			}
			
			else {
				j -= i / (i + 1);
			}
		} while (i < 99);
		return j ;
	}
	
	
	public static void main(String[] args) {
		Sec012 r1 = new Sec012();
		System.out.printf("%f", r1.run());
	}
}
