//���� -(1/2) + (2/3) - (3/4) + (4/5) - (5/6) + ... - (99/100)

package com.test;

public class Sec012 {
	static double i = 0; static double j = 0;
	
	public double run() {
		
		do {
			i++;
			
			if((int)(i/2) == i / 2) { // i�� 2�� ���� ������ ����� i�� 2�� ���� ���� ������ ���ڴ� ¦����.
				// (int)(3/2)= 1 , 3/2 = 1.5 �ٸ���. �� ���ڴ� Ȧ����.
				
				// ���ڰ� ¦�� �� ���� ���� �� ������ ���Ѵ�.
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
