package labb2.test;

import static org.junit.Assert.*
import labb2.Main

import org.junit.Test

class RandomTesting
{
	Random r = new Random()
	Main m = new Main()
	private static final int SIZE = 17
	private static final int N = 10000

	
	private int[] generateList()
	{
		def arr = []
		SIZE.times {
			arr << r.nextInt()
		}
		return arr
	}
	
	@Test void "One random list"()
	{
		int k = r.nextInt()
		int[] arr = generateList()
		assert arr.contains(k) == m.membership(arr, k)
	}
	
	@Test void "Ten random lists"()
	{
		10.times {
			int k = r.nextInt()
			int[] arr = generateList()
			assert arr.contains(k) == m.membership(arr, k)
		}
	}
	
	@Test void "N random lists"()
	{
		N.times
		{
			int k = r.nextInt()
			int[] arr = generateList()
			assert arr.contains(k) == m.membership(arr, k)
		}
		N.times
		{
			int[] arr = generateList()
			int k = arr[r.nextInt()%SIZE]
			assert m.membership(arr, k) 
		}
	}
}
