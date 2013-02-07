package labb2.test;

import static org.junit.Assert.*
import labb2.Main

import org.junit.Before
import org.junit.Test

class binarySearchTest {
	int[] arr;
	Main main;

	@Before void setUpSearch(){
		arr = [1,2,2,4,5,6,6,8];
		main = new Main();
	}
	
	@Test void searchTest(){
		assert(main.binarySearch(arr, 4) == 3);
		assert(main.binarySearch(arr, 3) == -1);
		
	}
}
