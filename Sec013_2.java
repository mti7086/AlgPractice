//���� �ٲ� �� ���� ����� ���ϱⰡ ������ �����Ǵ� ����

package com.test;

public class Sec013_2 {
	public static void main(String[] args) {
		int i = 0; int j = 1; int k = -1;
		int sw = -1; //����ġ ����
		
		do {
			i++;
			j += i;
			sw *= -1; // -1 * -1=���  -1 * 1=����
			k += (j * sw); // k = k + (J * sw)
		} while (i < 19);
		
		// ù ��° ���� ���� �հ踦 ������ k�� �ʱ� ������ ġȯ�Ͽ� �̹� ���� ������ 
		// ó�� �߱� ������ ù�� ° ���� ������ 19���� ���� ���ϱ� ���� i�� 19������ ������Ų��.
		
		System.out.printf("%d", k);
	}
}
