package ch13;

import java.util.Scanner;

public class BitOperationTest {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10;
		
		System.out.println(num1 | num2);
		System.out.println(num1 & num2);
		System.out.println(num1 ^ num2);
		System.out.println(~num1);
		
		System.out.println(num1 << 2);
		System.out.println(num1);
		System.out.println(num1 <<= 2);
		System.out.println(num1);
		
		int num = 1;
		int sum  = 0;
		
		while( num <= 10) {
			
			sum += num;
			num++;
		}
		
		System.out.println(sum);
		System.out.println(num);
		
	}
}
