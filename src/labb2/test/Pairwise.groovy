package labb2.test;

import static org.junit.Assert.*
import groovy.transform.Canonical
import labb2.Main

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
	final int[] defaultArray = N .. 1
	final int defaultKey = 3
	List<Pair> pairs = []
	
	Main m = new Main()
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
		int[] arr = N .. 1
		
		// Choose a value from the possible set.
		// Random ints in the range 0..99 in our case
		arr[x] = r.nextInt()%100;
		arr[y] = r.nextInt()%100;
		return arr
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
				//println([i:it, b:arr.contains(k), k:k, arr:arr])
				assert arr.contains(k) == m.membership(arr, k)
			}
		}
	}
	
	@Test void "Test key with entry in array"()
	{
		N.times {
			int i ->
				int[] arr = 17 .. 1
				int k = Math.abs(r.nextInt()%100)
				arr[i] = Math.abs(r.nextInt()%100)
				//println([i:i, b:arr.contains(k), k:k, arr:arr])
				assert arr.contains(k) == m.membership(arr, k)
		}
	}
	
}
