// 홀짝 판별을 이용한 반복 계산
// (-1)*2*(-3)*4*...*100의 합계 수열 구하기

package com.test;

public class Sec011_3 {
	public static void main(String[] args) {
		int i = 0; double j = 1;
		
		do {
			i++;
			
			if(i % 2 == 0) {
				//짝수일 때
				j = j*i;
			}
			
			else { //홀수
				j *= i * -1;
			}
		} while (i < 100);
		System.out.printf("%11.4e", j);
		//서식 문자열 "%11.4e"에 대응하는 실수 변수의 값을
		//소수점 이상 11자리, 소수점 이하 4자리를 잡아서 출력시킨다.
	}
}
