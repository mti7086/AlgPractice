//�Ǻ���ġ ����

package com.test;

import java.util.Scanner;

public class Sec015 {
	static int i = 1, j = 1; // i+j 
	static int ij, sum = 2, input, k; // ij = i+j, sum = ij + sum, input�� �Է°� ���庯��, k�� �ݺ���
	
	public int[] run() {
		System.out.println("���ڸ� �־� �ּ��� : ");

		Scanner scan = new Scanner(System.in);
		input = scan.nextInt();
		scan.close();
		
		for (k = 3; k <= input; k++) {
			ij = i + j;
			sum += ij;
			i = j;
			j = ij;
		}
		
		int[] arr = new int[2];
		arr[0] = input;
		arr[1] = sum;
		
		return arr;
		
	}
	
	public static void main(String[] args) {
		Sec015 r1 = new Sec015();
		int[] s1 = r1.run();

		System.out.printf("������ ���� %d���� �Ǻ���ġ ���: %d", s1[0], s1[1]);
	}
}
