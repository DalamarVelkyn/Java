public class StudentList {
	
	private int next;
	private int size;
    private Student[] list;

	public StudentList()
	{
		next = 0;
		size = 100;
		list = new Student[size];
	}
	
    public boolean insert(Student newStudent) 
	{
        if(next >= size)
			return false;
		list[next] = newStudent.deepCopy();
		if(list[next] == null)
			return false;
		next = next + 1;
		return true;
    }
	
	public Student fetch(String targetKey)
	{
		Student node;
		Student temp;
		int i = 0;
		
		while(i < next && !(list[i].compareTo(targetKey) == 0))
		{
			i++;
		}
		if(i == next)
			return null;
		node = list[i].deepCopy();
		if(i != 0)
		{
			temp = list[i - 1];
			list[i - 1] = list[i];
			list[i] = temp;
		}
		return node;
	}
	
	public boolean delete(String targetKey)
	{
		int i = 0;
		
		while(i < next && !(list[i].compareTo(targetKey) == 0))
		{
			i++;
		}
		if(i == next)
			return false;
		list[i] = list[next - 1];
		list[next - 1] = null;
		next = next - 1;
		return true;
	}
	
	public boolean update(String targetKey, Student newStudent)
	{
		if(delete(targetKey) == false)
			return false;
		else if(insert(newStudent) == false)
			return false;
		else
			return true;
	}
}