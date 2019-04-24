public class MainBinaryTree
{
	public static void main(String[] args)
	{
		BinaryTree t = new BinaryTree();
		
		Listing l;
		Listing l1 = new Listing("Joe", "First Street", "123 4567");
		Listing l2 = new Listing("Jack", "Second Street", "890 1234");
		Listing l3 = new Listing("Jill", "Third Street", "567 8901");
		Listing l4 = new Listing("Frank", "Fourth Street", "234 5678");
		Listing l5 = new Listing("Fred", "Fifth Street", "901 2345");
		Listing l6 = new Listing("Anne", "Sixth Street", "678 9012");
		Listing l7 = new Listing("Daisy", "Seventh Street", "345 6789");
		Listing l8 = new Listing("Ridley", "Eight Street", "012 3456");
		Listing l9 = new Listing("Jenny", "Ninth Street", "789 0123");
		Listing l10 = new Listing("Adam", "Tenth Street", "456 7890");
		Listing l11 = new Listing("Adrien", "Eleventh Street", "098 7654");
		
		t.insert(l9);
		t.insert(l7);
		t.insert(l10);
		t.insert(l2);
		t.insert(l8);
		t.insert(l1);
		t.insert(l4);
		t.insert(l3);
		t.insert(l6);
		t.insert(l5);
		
		System.out.println(t.fetch("Jill"));
		System.out.println(t.fetch("Anne"));
		System.out.println(t.fetch("Daisy"));
		
		t.delete("Jill");
		System.out.println(t.fetch("Jill"));
		t.delete("Anne");
		System.out.println(t.fetch("Anne"));
		t.delete("Daisy");
		System.out.println(t.fetch("Daisy"));
		
		t.update("Jack", l3);
		System.out.println(t.fetch("Jill"));
		System.out.println(t.fetch("Jack"));
		System.exit(0);	
	}
}