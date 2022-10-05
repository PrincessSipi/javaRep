public class Lemur extends Primates implements HasTail {
	public boolean isTailStriped(){
		return false;
	}

	public int age = 10;
	public static void main(String [] args){
		Lemur lemur = new Lemur();
		System.out.println(lemur.age);
		
		HasTail hasTail = lemur;
		System.out.println(hasTail.isTailStriped());

		Primates primates = lemur;
		System.out.println(primates.hasHair());
		
		// Object casting

		Primates primates1 = new Lemur(); // Implicit Cast
		//System.out.println(primates1.hasHair());

		//Lemur lemur2 = primates; // Does not compile
		//System.out.println(lemur2.age); 

		Lemur lemur3 = (Lemur)primates;  // Explicit Cast
		System.out.println(lemur3.age);


	}
}