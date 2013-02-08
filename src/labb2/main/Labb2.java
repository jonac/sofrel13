package labb2.main;

public interface Labb2 {
	/*
	 * @ requires (\forall int i; 0 < i && i < arr.length-1; arr[i+1] >=
	 * arr[i];); ensures contains(arr, key) && arr[\result] == key ||
	 * !contains(arr, key) && \result == -1;
	 * 
	 * @
	 */
	public int search(int[] arr, int key);

	/*
	 * @ requires true; ensures (\forall int i; 0 < i && i < arr.length-1;
	 * arr[i+1] >= arr[i];);
	 * 
	 * @
	 */
	public void sort(int[] arr);

	/*
	 * @ requires true; ensures contains(arr, key) && \result == true ||
	 * !contains(arr, key) && \result == false;
	 * 
	 * @
	 */
	boolean contains(int[] arr, int key);
}
