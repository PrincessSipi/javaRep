import java.lang.Class;
import java.lang.reflect.*;

class PrivFielReflection{
	public static void main(String[] args){
		try{
			// create an object of Dog
			Dog dog = new Dog();

			// create an object of Class
			Class obj = dog.getClass();

			// access the private field color
			Field field2 = obj.getDeclaredField("color");

			// allow modification of the private field
			field2.setAccessible(true);

			// set the value of color
			field2.set(dog, "Brown");			

			// get the value of the field color
			String colorValue = (String) field2.get(dog);
			System.out.println("Value: " + colorValue);

			// get the access modifier of the field type
			int modifier = field2.getModifiers();
			
			// convert the modifier to string form
			String modifier2 = Modifier.toString(modifier);
			System.out.println("Modifier: " + modifier2);
			System.out.println(" ");

		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}