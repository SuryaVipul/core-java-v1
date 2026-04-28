package oops.objectAndclasses;

class Student
{
	//instance variable 
	
	int id;
	String name;
	double age;
	
	void sleep()
	{
		id=4;
		int marks=10;
		System.out.println("Student is sleeping");
		System.out.println(id + " " + marks);
	}
	void study()
	{
		//marks=15;
		age=4.5;
		System.out.println("Student must study");
		System.out.println(age);
	}	
}
public class LaunchOOP1 
{
	public static void main(String[] args) 
	{
		Student stu=new Student();
		stu.sleep();
		stu.study();
	}

}
