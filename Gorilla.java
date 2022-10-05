public class Gorilla extends Animal4{
	public Gorilla(int age) {
		super(age,"Gorilla");

	}
	public Gorilla() {
		super(5);
	}

	public static void main(String[] args){
		Gorilla gor = new Gorilla(10, "Cutie");
		Gorilla gor1 = new Gorilla(20);
		Gorilla gor2 = new Gorilla();

		System.out.println(gor.age + " " + gor.name);
		System.out.println(gor1.age + " " + gor.name);
		System.out.println(gor2.age + " " + gor.name);

	}
}

// program doesn't compile create getters and setters in Animal4 to access private variables