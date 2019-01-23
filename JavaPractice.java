import java.util.Scanner;

public class JavaPractice
{
	public static void main(String[] args)
	{
		Person firstPerson = new Person();
		Person secondPerson = new Person();

		firstPerson = getData(firstPerson);
		secondPerson = getData(secondPerson);
		
		System.out.println("Second person's details:");
			System.out.println(secondPerson.getPersonName() + ", Age: " + secondPerson.getPersonAge());
			
		System.out.println("First person's details:");
			System.out.println(firstPerson.getPersonName() + ", Age: " + secondPerson.getPersonAge());
	}
	
	public static Person getData(Person s)
	{
		String name;
		double age;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter Name >> ");
		name = keyboard.nextLine();
		System.out.print("Enter Age >> ");
		age = keyboard.nextDouble();
		keyboard.nextLine();
		
		s.setPersonName(name);
		s.setPersonAge(age);
		return s;
	}
}