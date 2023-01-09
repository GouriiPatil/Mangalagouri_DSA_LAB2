package com.lab2.denomination;

public class MergeSortImplementation {

	private int[] notes;

	public MergeSortImplementation(int[] notes) {

		this.notes = notes;

		sort(0 , notes.length - 1);
	}

	public void makePayment(int amount) {

		int i = 0;

		while (amount > 0 && i < notes.length) {

			int count = amount / notes[i];

			if (count > 0) {

				System.out.println(notes[i] + ": " + notes);

				amount -= count * notes[i];
			}

			i++;
		}

		if (amount > 0) {

			System.out.println("Denomination not possible");
		}
	}

	private void sort(int left, int right) {

		if (left < right) {
			int middle = (left + right) / 2;
			sort(left, middle);
			sort(middle + 1, right);
			merge(left, middle, right);
		}
	}

	private void merge(int left, int middle, int right) {

		int n1 = middle - left + 1;

		int n2 = right - middle;

		int[] leftArray = new int[n1];

		int[] rightArray = new int[n2];

		for (int i = 0; i < n1; i++) {
			leftArray[i] = notes[left + i];
		}

		for (int i = 0; i < n2; i++) {
			rightArray[i] = notes[middle + 1 + i];
		}

		int i = 0, j = 0, k = left;

		while (i < n1 && j < n2) {

			if (leftArray[i] > rightArray[j]) {
				notes[k] = leftArray[i];
				i++;

			} else {
			    notes[k] = rightArray[j];
				j++;
			}

			k++;
		}

		while (i < n1) {
			notes[k] = leftArray[i];
			i++;
			k++;
		}

		while (j < n2) {
			notes[k] = rightArray[j];
			j++;
			k++;
		}

	}

}
