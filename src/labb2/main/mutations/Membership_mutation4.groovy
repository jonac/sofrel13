package labb2.main.mutations;

import labb2.main.Membership_interface;

public class Membership_mutation4 implements Membership_interface{
	/*
	 * @ requires (\forall int i; 0 < i && i < arr.length-1; arr[i+1] >=
	 * arr[i];); ensures contains(arr, key) && arr[\result] == key ||
	 * !contains(arr, key) && \result == -1;
	 *
	 * @
	 */
	public int binarySearch(int[] arr, int key) {
		int l, r, index;
		l = 0;
		r = arr.length - 1;
		// println ([arr:arr, key:key])
		while (key != arr[index] && l <= r) {
			index = (l + r) / 2;
			// println ([index : index, value: arr[index], left:l, right: r])
			if (key < arr[index])
				r = index - 1;
			else
				l = index + 1;
		}

		if (key == arr[index])
			return index;
		else
			return -1;
	}

	/*
	 * @ requires true; ensures (\forall int i; 0 < i && i < arr.length-1;
	 * arr[i+1] >= arr[i];);
	 *
	 * @
	 */
	public void sorting(int[] arr) {
		int min;
		int k;
		for (int i = 0; i < arr.length; i++) {
			k = i;
			min = arr[i];
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < min) {
					min = arr[j];
					j = k; //Mutated Fault Switched j and k
				}
			}
			int temp = arr[i];
			arr[i] = min;
			arr[k] = temp;
		}
	}

	/*
	 * @ requires true; ensures contains(arr, key) && \result == true ||
	 * !contains(arr, key) && \result == false;
	 *
	 * @
	 */
	boolean membership(int[] arr, int key)
	{
		sorting arr
		binarySearch(arr, key) != -1
	}
}
