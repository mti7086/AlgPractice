// Ȧ¦ �Ǻ��� �̿��� �ݺ� ���
// (-1)*2*(-3)*4*...*100�� �հ� ���� ���ϱ�

package com.test;

public class Sec011_3 {
	public static void main(String[] args) {
		int i = 0; double j = 1;
		
		do {
			i++;
			
			if(i % 2 == 0) {
				//¦���� ��
				j = j*i;
			}
			
			else { //Ȧ��
				j *= i * -1;
			}
		} while (i < 100);
		System.out.printf("%11.4e", j);
		//���� ���ڿ� "%11.4e"�� �����ϴ� �Ǽ� ������ ����
		//�Ҽ��� �̻� 11�ڸ�, �Ҽ��� ���� 4�ڸ��� ��Ƽ� ��½�Ų��.
	}
}
