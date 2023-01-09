package com.lab2.denomination;

public class CalculateNotes {

	public void calculateNotesImplementation(int[] notes, int amount) {

		int[] counter = new int[notes.length];

		try {

			for (int i = 0; i < notes.length; i++) {

				if (amount >= notes[i]) {

					counter[i] = amount / notes[i];

					amount -= notes[i] * counter[i];
				}
			}

			if (amount > 0) {

				System.out.println("Exact amount cannot be given with the Highest Denomination");

			} else {

				System.out.println("Your Payment can be done with following order: ");

				for (int i = 0; i < notes.length; i++) {

					if (counter[i] != 0) {

						System.out.println(notes[i] + ":" + counter[i]);
					}
				}
			}
		} catch (ArithmeticException e) {

			System.out.println(e + " Invalid Denomination");
		}
	}

}
