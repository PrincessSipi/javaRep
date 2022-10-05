public class Outer1{

	private int length = 5;
	public void calculate(){
		final int width = 20;
		class Inner{
		
			public void multiply(){
				System.out.println(length * width);
			}
		}
		Inner inner = new Inner();
		inner.multiply();
	}
	
	public static void main(String[] args){
		Outer1 outer1 = new Outer1();
		outer1.calculate();

	}
}

// local Inner class