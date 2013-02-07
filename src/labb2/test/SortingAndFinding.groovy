package labb2.test;

import static org.junit.Assert.*
import labb2.Main

import org.junit.Before
import org.junit.Test

class SortingAndFinding
{
	int[] arr
	Main m
	
	@Before void setup()
	{
		arr = [5, 4, 3, 2, 1]
		m = new Main()
	}
	
	@Test void "sort and find test"()
	{
		assert !m.membership(arr, 7)
		assert m.membership(arr, 2)
		
	}
	
	
}
