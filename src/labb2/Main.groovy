package labb2;

public class Main {

	public int binarySearch(int[] arr, int key) {
		int l,r,index;
		l = 1; r=arr.length;
		while (key!=arr[index] && l<=r){
			index = (l+r)/2;
			//println("index : $index value ${arr[index]} left: $l right: $r")
			if(key < arr[index]) r=index-1;
			else l = index+1;
		}

		if(key == arr[index]) return index;
		else return -1;
	}

	public void sorting(int[] arr) {
		int min;
		int k;
		for (int i = 0; i < arr.length; i++) {
			k = i;
			min = arr[i];
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < min) {
					min = arr[j];
					k = j;
				}
			}
			int temp = arr[i];
			arr[i] = min;
			arr[k] = temp;
		}
	}
	
	boolean membership(int[] arr, int key)
	{
		return false;	
	}
}
