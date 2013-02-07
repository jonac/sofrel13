package labb2.test;

import static org.junit.Assert.*
import labb2.Main

import org.junit.Before
import org.junit.Test

class Pairwise
{
	
	
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
		N.times
		{
			i ->
			((i+1)..N).each
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
		// Random ints in our case
		arr[x] = r.nextInt()%1000;
		arr[y] = r.nextInt()%1000;
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
	
}
