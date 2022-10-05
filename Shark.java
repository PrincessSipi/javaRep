public class Shark extends Fish{
	private int numberOfFins = 8;

	public Shark(int age){
		super(age) = age;
		this.size = 4;
	}

	public void displaySharkDetails(){
		System.out.print("Shark of age " + super.getAge());
		System.out.print(" and " + super.size + " metres long ");
		System.out.print(" with "+ this.numberOfFins + " fins");
	}
}