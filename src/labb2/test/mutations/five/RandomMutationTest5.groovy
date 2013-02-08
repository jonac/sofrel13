package labb2.test.mutations.five;

import static org.junit.Assert.*
import labb2.main.Labb2
import labb2.main.mutations.Membership_mutation5;

import org.junit.Test

class RandomTesting
{
	Random r = new Random()
	Labb2 m = new Membership_mutation5()
	private static final int SIZE = 17
	private static final int N = 10000

	
	private int generateKey()
	{
		r.nextInt() % 100
	}
	
	private int[] generateList()
	{
		def arr = []
		SIZE.times {
			arr << r.nextInt() % 100
		}
		return arr
	}
	
	@Test void "One random list"()
	{
		int k = generateKey()
		int[] arr = generateList()
		assert arr.contains(k) == m.membership(arr, k)
	}
	
	@Test void "Ten random lists"()
	{
		10.times {
			int k = generateKey()
			int[] arr = generateList()
			assert arr.contains(k) == m.membership(arr, k)
		}
	}
	
	@Test void "N random lists"()
	{
		N.times
		{
			int k = generateKey()
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
