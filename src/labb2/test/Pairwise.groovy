package labb2.test;

import static org.junit.Assert.*
import groovy.transform.Canonical
import labb2.main.Membership;
import static Math.abs

import org.junit.Before
import org.junit.Test

class Pairwise
{
	
	@Canonical
	class Pair
	{
		int x, y
	}
	
	final int N = 17
	final int defaultKey = 3
	List<Pair> pairs = []
	
	Membership m = new Membership()
	Random r = new Random()
	
	@Before void setup()
	{
		generatePairs()
	}
	
	void generatePairs()
	{
		println "meep"
		(0..(N-2)).each
		{
			i ->
			((i+1)..(N-1)).each
			{
				j ->
					println "$i, $j"
					pairs << new Pair(x:i, y:j)
			}
		}
	}
	
	int[] generateArray(x, y)
	{
		int[] arr = generateDefaultArray()
		
		// Choose a value from the possible set
		// Random ints in the range 0..99 in our case
		arr[x] = generateValue()
		arr[y] = generateValue()
		return arr
	}
	
	int generateValue()
	{
		r.nextInt()%100
	}
	
	int[] generateDefaultArray()
	{
		N .. 1
	}
	
	@Test void "Test pairs in array"()
	{
		int k = defaultKey
		pairs.each
		{
			Pair p ->
			N.times
			{
				int[] arr = generateArray(p.x, p.y)
				assert arr.contains(k) == m.membership(arr, k)
			}
		}
	}
	
	@Test void "Test key with entry in array"()
	{
		N.times {
			int i ->
				int[] arr = 17 .. 1
				int k = abs(generateValue())
				arr[i] = abs(generateValue())
				assert arr.contains(k) == m.membership(arr, k)
		}
	}
	
	@Test void "Test valid key with entry in array"()
	{
		N.times
		{
			int i ->
				int[] arr = generateDefaultArray()
				int k = generateValue()
				arr[i] = k
				assert m.membership(arr, k)
		}
	}
	
	
}
