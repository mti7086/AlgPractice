//�� ������ �����ϴ� ���� ������ ������ �����ϴ� ����
// 1+2+4+7+11+16+22+...�� �����ϴ� ����

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
