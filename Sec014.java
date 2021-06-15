//1! + 2! + 3! + ... + 10!의 순서로 나열되는 수열의 10번째 항까지의 합게를 구하시오

/*
package com.test;

public class Sec014 {
	public static void main(String[] args) {
		int i = 1; int k = 1; int j = 1;
		
		do{
			i++;
			j *= i;
			k += j;
		} while (i < 10);
		System.out.printf("%d", k);
	}
 }
*/

package com.test;

public class Sec014 {
	static int count = 1; static int i = 0; static int sum = 0;
	
	public static int fact(int n) {
		if (n <= 1) {
			return n;
		}
		
		else {
			return n * fact(n-1);
		}
	}
	
	public static int run() {
		
		do {
			i++;
			sum += fact(count);
			count++;
		} while (i < 10);
		
		return sum;
	}


	public static void main(String[] args) {
		Sec014 f1 = new Sec014();
		f1.run();
		System.out.printf("%d\n", sum);
	}
}