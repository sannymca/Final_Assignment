
/*
2. Write a Java program to invoke parent class constructor from a child class. Create
Child class object and parent class constructor must be invoked. Demonstrate by
writing a program. Also explain key points about Constructor.
*/

package assignment;

class Parent {
    public Parent() {
        System.out.println("Parent constructor invoked");
    }
}

class Child extends Parent {
    public Child() {
        super(); // Invoking the parent class constructor
        System.out.println("Child constructor invoked");
    }
}
public class Question2 {

	public static void main(String[] args)
	{
		Child child = new Child(); // Creating Child class object

	}

}
