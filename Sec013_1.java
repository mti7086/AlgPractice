//1+3+6+10+15+21+28+... �� ������ �����Ǵ� ������ 20���� �ױ����� �հ踦 ���Ͻÿ�.

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
