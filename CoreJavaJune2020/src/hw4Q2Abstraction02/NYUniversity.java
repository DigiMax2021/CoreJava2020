package hw4Q2Abstraction02;

public class NYUniversity extends EngineeringSchool { //inherited an abstract class
	
	//a regular class can only inherit either an abstract class or another regular class using exacts keyword
	//a regular class cannot inherit interface using extends keyword
//Multiple inheritance is forbidden in java and also not permissible by extends command

		//a regular class can inherit one or multiple interface using implements keyword
		//a regular class cannot inherit an abstract class or another regular class using implements keyword

	
	public NYUniversity() {// default constructor
		System.out.println("This is the default constructor of NY University Class");
	}
	
	public void physics() { //non-abstract method
		System.out.println("This is Chemistry Method");
	}
	
	/*public abstract void anthropology() { //abstract class cannot be implemented in regular class
		System.out.println("Math");
	}
	*/

}
