package labb2.test;

import static org.junit.Assert.*
import labb2.main.Membership;

import org.junit.Before
import org.junit.Test

class SortingAndFinding
{
	int[] arr
	Membership m
	
	@Before void setup()
	{
		arr = [5, 4, 3, 2, 1]
		m = new Membership()
	}
	
	@Test void "sort and find test"()
	{
		assert !m.contains(arr, 7)
		assert m.contains(arr, 2)
		
	}
	
	
}
