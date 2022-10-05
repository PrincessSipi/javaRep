import java.util.*;
import java.util.function.*;

public class Crow{
	public static void main(String[] args){
		private String color;
		Crow crow = new Crow();
		crow.caw("Millie");
		
		
	}
	
	public void caw(String name){
			String volume = "loudly";
			Consumer<String> consumer = s ->System.out.println(name + " says " + volume + " that she is " + color);
		}
	
	
}
// fix this program it has errors