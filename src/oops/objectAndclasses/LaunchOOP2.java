package oops.objectAndclasses;

class Dog
{
	//instance variable
	//scope is entire class
	//default values will be assigned int --> 0 , String --> null, double --> 0.0. boolean --> false
	
	int cost;
	//cost=0;
	
	String name;
	//name=null;
	
	void barks()
	{
		int age=4;//local variable
		System.out.println("Dog barks");
		age=6;
//		String color;
//		System.out.println(color);
		System.out.println(age);
		System.out.println(name);
		
	}
	
	void run()
	{
		//age=5;
		
		System.out.println("Dog is running");
		//name="lobo";
	}
	
}
public class LaunchOOP2 
{
	public static void main(String[] args) 
	{
		Dog dog=new Dog();
		dog.barks();
		dog.run();
	}

}
