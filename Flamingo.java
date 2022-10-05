public class Flamingo{
	private String color;
	public void setColor(String color){
		this.color = color;
	}

	public static void main(String[] args){
		Flamingo f = new Flamingo();
		f.setColor("PINK");
		System.out.println(f.color);

	}
}