public class Hippo extends Animal5{
	// demonstrating order of initialization

	static {System.out.print("B");}
	public static void main(String[] args){
		System.out.print("C");
		new Hippo();
		new Hippo();
		new Hippo();

	}
}