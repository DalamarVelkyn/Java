import java.util.Scanner;

public class Main 
{

    public static void main(String[] args) 
	{

        LinkedList list = new LinkedList(new Node("Andrew Dennis", 43521, 3.6));

        list.append((new Node("Francine Emmet", 12345, 4.0)));
        list.append((new Node("George Ferrel", 54321, 3.5)));

		list.insertNodeAtPosition(new Node("Bill Bob", 54532, 3.2), 0);
        list.insertNodeAtPosition(new Node("Steven Ardent", 14235, 3.0), 0);
        list.insertNodeAtPosition(new Node("Catherine Cork", 14233, 3.7), 1);
        list.insertNodeAtPosition(new Node("Angelina Golly", 24351, 3.8), 6);

        list.print();
		
		Scanner input = new Scanner(System.in);
			
		Integer selection;
		String name;
		Integer id;
		Double gpa;
		Integer position;
		
		System.out.println("Enter 1 to add student: \nEnter 2 to retrieve a student's information: \nEnter 3 to delete a student: \nEnter 4 to update a student's information: \nEnter 5 to retrieve all students' information: \nEnter 6 to exit:");
			
		selection = input.nextInt();
			
		while(selection != 6)
		{
			if(selection == 1)
			{
				System.out.println("Enter Student's Name");
				input.nextLine();
				name = input.nextLine();
				System.out.println("Enter Student's ID");
				id = input.nextInt();
				System.out.println("Enter Student's GPA");
				gpa = input.nextDouble();
								
				list.append((new Node(name, id, gpa)));
					
				System.out.println("Enter 1 to add student: \nEnter 2 to retrieve a student's information: \nEnter 3 to delete a student: \nEnter 4 to update a student's information: \nEnter 5 to retrieve all students' information: \nEnter 6 to exit:");
				selection = input.nextInt();	
			}
			else if(selection == 2)
			{
				System.out.println("Enter Student's Record #:");
				position = input.nextInt();
				
				list.printSpecific(position);
								
				System.out.println("\nEnter 1 to add student: \nEnter 2 to retrieve a student's information: \nEnter 3 to delete a student: \nEnter 4 to update a student's information: \nEnter 5 to retrieve all students' information: \nEnter 6 to exit:");
				selection = input.nextInt();
			}
			else if(selection == 3)
			{
				System.out.println("\nEnter 1 to add student: \nEnter 2 to retrieve a student's information: \nEnter 3 to delete a student: \nEnter 4 to update a student's information: \nEnter 5 to retrieve all students' information: \nEnter 6 to exit:");
				selection = input.nextInt();
			}
			else if(selection == 5)
			{
				list.print();
				System.out.println("\nEnter 1 to add student: \nEnter 2 to retrieve a student's information: \nEnter 3 to delete a student: \nEnter 4 to update a student's information: \nEnter 5 to retrieve all students' information: \nEnter 6 to exit:");
				selection = input.nextInt();
			}
			else
			{
				System.out.println("\nYou have selected " + selection + ". This is not a valid choice");
				System.out.println("\nEnter 1 to add student: \nEnter 2 to retrieve a student's information: \nEnter 3 to delete a student: \nEnter 4 to update a student's information: \nEnter 5 to retrieve all students' information: \nEnter 6 to exit:");
				selection = input.nextInt();
			}
		}
		
		System.exit(0);
	}
}