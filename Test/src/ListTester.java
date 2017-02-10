import java.util.LinkedList;
import java.util.ArrayList;

public class ListTester 
{
	public static void main(String[] args)
	{
		// Creates an empty LinkedList
		LinkedList<Student> list = new LinkedList<Student>();
		
		// Creates Students, adds them to list
		Student temp = new Student("Jones", "Lucas", 3.50);
		list.add(temp);
		temp = new Student("White", "Kelly", 4.00);
		list.add(temp);
		temp = new Student("Thomas", "Kaneshia", 3.75);
		list.add(temp);
		temp = new Student("Grant", "Diego", 3.67);
		list.add(temp);
		temp = new Student("Rivers", "Jennifer", 3.25);
		list.add(temp);
		temp = new Student("Beltre", "Janine", 3.88);
		list.add(temp);
		temp = new Student("White", "Marissa", 3.91);
		list.add(temp);
		
		
		// Task 1: Put code here that will display each student in the list, 
		// one line at a time.
		for(Student temp2 : list)
		{
			System.out.println(temp2+" ");
		}
		System.out.println();
		
		// Task 2: Put code here that will sort the list by last name, 
		// then first name. After the list is sorted display each student 
		// in the list, one line at a time. (Note: You will need to use
		// the compareTo() method in the String class. See the Java API
		// for details.)
		
		for(int i=0; i<list.size(); i++)
		{
			for(int a=i+1; a<list.size(); a++)
			{
				Student tempA = list.get(a);
				Student tempB = list.get(i);
				
				if(tempA.last().compareTo(tempB.last()) < 0)
				{
					Student temp3 = list.get(i);
					list.set(i, list.get(a));
					list.set(a, temp3);
				}
				if(tempA.last().compareTo(tempB.last()) == 0)
				{
					if(tempA.first().compareTo(tempB.first()) < 0)
					{
						Student temp3 = list.get(i);
						list.set(i, list.get(a));
						list.set(a, temp3);
					}
				}
			}
		}
		
		for(Student temp2 : list)
		{
			System.out.println(temp2+" ");
		}
		System.out.println();
		
		// Task 3: Put code here that will sort the list by grade point, 
		// average. After the list is sorted display each student in the
		// list, one line at a time.
		
		for(int i=0; i<list.size(); i++)
		{
			for(int a=i+1; a<list.size(); a++)
			{
				Student tempA = list.get(a);
				Student tempB = list.get(i);
				
				if(tempA.getGPA() > tempB.getGPA())
				{
					Student temp3 = list.get(i);
					list.set(i, list.get(a));
					list.set(a, temp3);
				}
			}
		}
		
		for(Student temp2 : list)
		{
			System.out.println(temp2+" ");
		}
		System.out.println();
		
		// Task 4: Create two new students, and add each of the them to the 
		// list using a loop that inserts them in grade point average 
		// order. Then display each student in the list, one line at a time.
	}
}