public class Beetle extends Insect{

	protected int numberOfLegs = 6;
	short age = 3;
	
	public void printData(){
		System.out.print(this.label + " ");
		System.out.print(super.label+ " ");
		System.out.print(this.age+ " ");
		//System.out.print(super.age+ " ");  this will cause an error no age in superclass
		System.out.print(numberOfLegs+ " ");
	}

	public static void main(String []n){
		new Beetle().printData();
	}

}