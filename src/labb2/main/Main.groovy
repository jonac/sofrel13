package labb2.main;

import labb2.main.mutations.Membership_mutation1
import labb2.main.mutations.Membership_mutation2
import labb2.main.mutations.Membership_mutation3
import labb2.main.mutations.Membership_mutation4
import labb2.main.mutations.Membership_mutation5
import labb2.main.mutations.Membership_mutation6

mutations = [
		new Membership_mutation1(),
		new Membership_mutation2(),
		new Membership_mutation3(),
		new Membership_mutation4(),
		new Membership_mutation5(),
		new Membership_mutation6()
		];
	
mutations.each
{
	Membership_interface i ->
		try
		{
			println i.membership(1..17 as int[], 6)
			println i.membership(1..17 as int[], 1)
			println i.membership(17..1 as int[], 3)
			println i.membership(1..17 as int[], 1)
		} catch(Exception e){
			println e			
		}	
}
