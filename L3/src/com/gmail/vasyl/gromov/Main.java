package com.gmail.vasyl.gromov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		int max;

		Scanner sc = new Scanner(System.in);
		System.out.println("Input the first number");
		a = sc.nextInt();
		System.out.println("Input the second number");
		b = sc.nextInt();
		System.out.println("Input the third number");
		c = sc.nextInt();
		System.out.println("Input the fourth number");
		d = sc.nextInt();

		System.out.println("Your numbers:" + a + ", " + b + ", " + c + ", " + d);

		max = a;
		if (max < b) {
			max = b;
		} if (max < c) {
			max = c;
		} if (max < d) {
			max = d;
		}

		System.out.println("Maximum number: " + max);

		}
	}