package com.lab2.denomination;

import java.util.Scanner;

public class CalculateNotesImplementation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		CalculateNotes calculatenotes = new CalculateNotes();

		System.out.println("Enter size of Currency Denominations:");
		
		int size = sc.nextInt();

		int[] notes = new int[size];

		System.out.println("Enter the values of Currency Denomination:");
		
		for (int i = 0; i < size; i++) {
			
			notes[i] = sc.nextInt();
		
		}

		System.out.println("Enter the amount you desire to pay: ");
		
		int amount = sc.nextInt();
		
		MergeSortImplementation mergesortimplementation = new MergeSortImplementation(notes);
		
		calculatenotes.calculateNotesImplementation(notes, amount);
		

	}

}
