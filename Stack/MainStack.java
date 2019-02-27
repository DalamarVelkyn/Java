public class MainStack
{
	public static void main(String[] args)
	{
		Stack s = new Stack(3);
		Listing l;
		Listing l1 = new Listing("Bill", "1st Avenue", "123 4567");
		Listing l2 = new Listing("Al", "2nd Avenue", "456 3232");
		Listing l3 = new Listing("Mike", "3rd Avenue", "333 3333");
		Listing l4 = new Listing("Carol", "4th Avenue", "444 4444");
		
		System.out.println(s.pop()); //pop the top entry in the stack, which is currently empty
		
		System.out.println(s.push(l1)); //push 3 new entries in order L1 goes to the bottom of the stack, L3 is on top
		System.out.println(s.push(l2));
		System.out.println(s.push(l3));
		s.showAll(); //display in order from top of stack to bottom, L3 displays first
		
		l = s.pop(); //pop function first remembers the current top record, then pops it out, then prints out the record that was just popped out
		System.out.println(l.toString()); //at the time of printing, the record only exist in temporary topLocation variable, soon to be rewritten
		l = s.pop(); //by the second pop function
		System.out.println(l.toString());
		l = s.pop();
		System.out.println(l.toString());
		System.out.println(s.pop()); //since there is no string to print out, condensing the code that tests the empty stack to a single line is sufficient
		System.exit(0);
	}
}