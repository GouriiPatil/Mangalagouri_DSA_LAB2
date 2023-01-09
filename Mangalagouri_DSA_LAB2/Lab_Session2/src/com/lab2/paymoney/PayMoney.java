package com.lab2.paymoney;

import java.util.Scanner;

public class PayMoney {
	
	public static void main(String[] args) throws Exception{

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of Transactions Array:");

		int size = sc.nextInt();

		int transactions[] = new int[size];

		System.out.println("Enter the list of transactions:");

		for (int i = 0; i < size; i++) {

			transactions[i] = sc.nextInt();
		}

		System.out.println("Enter the total no of targets to be acheived:");

		int target_no = sc.nextInt();

		while (target_no-- != 0) {

			int flag = 0;

			long target;

			System.out.println("Enter the value of target:");

			target = sc.nextLong();

			long sum = 0;

			for (int i = 0; i < size; i++) {

				sum += transactions[i];

				if (sum >= target) {

					System.out.println("Target is acheived after " + (i + 1) + "transactions.");

					flag = 1;

					break;
				}
			}

			if (flag == 0)

				System.out.println("Target is not acheived");

		}

		sc.close();
	}
}
