package labb2.test;

import static org.junit.Assert.*
import labb2.Main

import org.junit.Test

class RandomTesting
{
	Random r = new Random()
	Main m = new Main()
	private static final int SIZE = 17

	
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
		int[] arr = generateList();
		assert arr.contains(k) == m.membership(arr, k)
	}
	
	@Test void "Ten random lists"()
	{
		10.times {
			int k = r.nextInt()
			int[] arr = generateList();
			println "meep!"
			assert arr.contains(k) == m.membership(arr, k)
		}
	}
}
