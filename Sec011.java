//���� 1-2+3-4+5-6+...+99-100�� �հ�(����ġ �����̿�)

package com.test;

public class Sec011 {
	public static void main(String[] args) {
		int i, j, sw;
		i = 0; j = 0; sw = 0;
		
		do {
			i++;
			
			if(sw == 0) {
				j += i;
				sw = 1;
			}
			
			else {
				j -= i;
				sw = 0;
			}
		} while (i<100);
		
		System.out.printf("%d", j);
	}
}
