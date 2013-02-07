package labb2.test;

import static org.junit.Assert.*
import labb2.Main

import org.junit.Before
import org.junit.Test

class SortingTest
{
	int[] arr;
	Main main;
	
	@Before void setupSort()
	{
		this.arr = [5, 4, 3, 2]
		main = new Main()	
	}
	
	@Test void sortTest()
	{
		main.sorting(arr)
		println arr
	}
}
