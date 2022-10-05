enum Sizes3{
	// enum constants calling the enum constructors
	SMALL("The size is small"),
	MEDIUM("The size is medium"),
	LARGE("The size is large"),
	EXTRAlARGE("The size is extra large");

	private final String pizzaSize;

	// private enum constructor

	private Sizes3(String pizzaSize){
		this.pizzaSize = pizzaSize;
	
	}

	public String getSize(){
		return pizzaSize;
	
	}
}

class Size3{
	public static void main(String[] args){
		Sizes3 sizes3 = Sizes3.SMALL;
		System.out.println(sizes3.getSize());
	}
}