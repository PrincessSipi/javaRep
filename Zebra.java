public class Zebra extends Animal2{
	public Zebra(int age){
		super(age);   // refers to constructor in Animal2
	}

	public Zebra(){
		this(4);   // refers to constructor in Zebra with int argument
	}
}