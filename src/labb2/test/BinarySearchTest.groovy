package labb2.test;

import static org.junit.Assert.*
import labb2.main.Membership;

import org.junit.Before
import org.junit.Test

class BinarySearchTest {
	int[] arr;
	Membership main;

	@Before void setUpSearch(){
		arr = [1,2,2,4,5,6,6,8];
		main = new Membership();
	}
	
	@Test void searchTest(){
		assert(main.search(arr, 4) == 3);
		assert(main.search(arr, 3) == -1);
		
	}
}
