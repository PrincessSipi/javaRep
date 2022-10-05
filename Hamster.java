public class Hamster{
	private String color;
	private int weight;

	//public Hamster(int weight){		// first constructor
	//	this.weight = weight;
	//	color = "brown";

	//}
	
	public Hamster(int weight){		// first constructor replacement using this()
		this(weight,"brown");
	}


	public Hamster(int weight, String color){		// second constructor
		this.weight = weight;
		this.color = color;

	}

	public static void main(String[] args){
		Hamster ham = new Hamster(14);
		System.out.println(ham.weight + " " + ham.color);

	}
}