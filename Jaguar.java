public class Jaguar extends BigCat{
 	public Jaguar(){
		size = 10.2;
	}

	public void printDetails(){
		System.out.println(size);
	}

	public static void main(String[] args){
		new Jaguar().printDetails();
	}
}