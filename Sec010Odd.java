//Ȧ���� �հ� ����ϱ�

package com.test;

public class Sec010Odd {
	public static void main(String[] args) {
		int i=-1; int j=0;
		
		do {
			i += 2;
			j += i;
		} while (i<99);
		
		System.out.printf("%d, %d", i, j);
	}
}
