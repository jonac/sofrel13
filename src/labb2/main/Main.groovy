package labb2.main;

public class Main {

	ArrayList<Membership_interface> arr

	public test(){
		arr = new ArrayList<Membership_interface>()
		arr.add(new Membership_mutation1());
		arr.add(new Membership_mutation2());
		arr.add(new Membership_mutation3());
		arr.add(new Membership_mutation4());
		arr.add(new Membership_mutation5());
		arr.add(new Membership_mutation6());
		println(arr[1].membership([1,2,3,4,5,6,7], 1));
	}

	public static void main(String[] args){
		Main m = new Main();
		m.test();
	}
}
