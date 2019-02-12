public class Main {

    public static void main(String[] args) 
	{
		StudentList students = new StudentList();
		Student temp;
		
		Student dick = new Student("Richard", "Johns");
		Student harry = new Student ("Harry", "Stevens");
		Student tom = new Student ("Thomas", "Andrews");
		
		System.out.println(" ");
		System.out.println("Insert and Fetch test");
		System.out.println(students.insert(dick)); //insert predefined students to the array
		System.out.println(students.insert(tom));
		System.out.println(students.fetch("Harry")); //attempt to fetch a student that hasn't been inserted
		temp = students.fetch("Richard"); //fetch added student via a temporary parameter
		System.out.println(temp.toString());
		temp = students.fetch("Thomas"); //update temporary parameter with the new student and fetch
		System.out.println(temp.toString());
		
		System.out.println(" ");
		System.out.println("Test of encapsulation within temp parameter");
		tom.setSurname("Franz"); //change surname of Tom, leave data within temp parameter unchanged
		System.out.println(tom.toString()); //"Thomas Franz"
		//temp = students.fetch("Thomas"); //technically this line is unneccessary
		System.out.println(temp.toString()); //"Thomas Andrews"
		
		System.out.println(" ");
		System.out.println("Test of deletion, false-doesn't exist, true-deletion successful, null-can't find data to print");
		System.out.println(students.delete("Harry")); //Harry doesn't exit
		System.out.println(students.delete("Thomas")); 
		System.out.println(students.fetch("Thomas")); //should return Null as there is nothing to print
		
		System.out.println(" ");
		System.out.println("Test update, false-doesn't exist, true-update successful, null-data doesn't exist anymore");
		System.out.println(students.update("Harry", dick)); //Harry doesn't exist
		students.insert(tom); //add data for Tom (deleted in previous test)
		System.out.println(students.update("Thomas", harry)); //turn Tom into Harry
		System.out.println(students.fetch("Thomas")); //should return Null as Tom is now Harry
		temp = students.fetch("Harry");
		System.out.println(temp.toString()); //"Harry Stevens"
		System.exit(0);
    }
}