import java.lang.Class;
import java.lang.reflect.*;

class FielReflection{
	public static void main(String[] args){
		try{
			// create an object of Dog
			Dog dog = new Dog();

			// create an object of Class
			Class obj = dog.getClass();

			// access and set the type field
			Field field1 = obj.getField("type");
			field1.set(dog, "Labrador");

			// get the value of the field type
			String typeValue = (String) field1.get(dog);
			System.out.println("Value: " + typeValue);

			// get the access modifier of the field type
			int modifier = field1.getModifiers();
			
			// convert the modifier to string form
			String modifier1 = Modifier.toString(modifier);
			System.out.println("Modifier: " + modifier1);
			System.out.println(" ");

		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}