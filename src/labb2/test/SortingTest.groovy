package labb2.test;

import static org.junit.Assert.*
import labb2.main.Membership;

import org.junit.Before
import org.junit.Test

class SortingTest
{
	int[] arr;
	Membership main;
	
	@Before void setupSort()
	{
		this.arr = [5, 4, 3, 2]
		main = new Membership()	
	}
	
	@Test void sortTest()
	{
		main.sort(arr)
		println arr
	}
}
