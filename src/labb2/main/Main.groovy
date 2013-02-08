package labb2.main;

import labb2.main.mutations.Mutation1
import labb2.main.mutations.Mutation2
import labb2.main.mutations.Mutation3
import labb2.main.mutations.Mutation4
import labb2.main.mutations.Mutation5
import labb2.main.mutations.Mutation6

mutations = [
		new Mutation1(),
		new Mutation2(),
		new Mutation3(),
		new Mutation4(),
		new Mutation5(),
		new Mutation6()
		];
	
mutations.each
{
	Labb2 i ->
		try
		{
			println i.contains(1..17 as int[], 6)
			println i.contains(1..17 as int[], 1)
			println i.contains(17..1 as int[], 3)
			println i.contains(1..17 as int[], 1)
		} catch(Exception e){
			println e			
		}	
}
