package labb2.main;

public interface Membership_interface {
	/*
	 * @ requires (\forall int i; 0 < i && i < arr.length-1; arr[i+1] >=
	 * arr[i];); ensures contains(arr, key) && arr[\result] == key ||
	 * !contains(arr, key) && \result == -1;
	 * 
	 * @
	 */
	public int binarySearch(int[] arr, int key);

	/*
	 * @ requires true; ensures (\forall int i; 0 < i && i < arr.length-1;
	 * arr[i+1] >= arr[i];);
	 * 
	 * @
	 */
	public void sorting(int[] arr);

	/*
	 * @ requires true; ensures contains(arr, key) && \result == true ||
	 * !contains(arr, key) && \result == false;
	 * 
	 * @
	 */
	boolean membership(int[] arr, int key);
}