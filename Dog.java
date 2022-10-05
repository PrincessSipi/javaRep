// put this class in different Dog.java file

public class Dog extends Animal{

	public String type;
	private String color;

	// public constructor without Parameter
	public Dog(){

	}

	// private constructor with a single Parameter
	public Dog(int age){

	}	

	public void display(){
		System.out.println("I am a dog");
	}

	private void makeSound(){
		System.out.println("Woof! Woof!");
	}
}
