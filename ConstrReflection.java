import java.lang.Class;
import java.lang.reflect.*;

class ConstrReflection{
	public static void main(String[] args){
		try{
			// create an object of Dog
			Dog dog = new Dog();

			// create an object of Class
			Class obj = dog.getClass();

			// using the object of the class to get
			// all declared constructors of Dog

			Constructor[] constructors = obj.getDeclaredConstructors();

			// create an object of the Method Class
			for(Constructor c : constructors){

				// get names of constructors
				System.out.println("Constructor Name: " +c.getName());

				// get the access modifier of the constructors
				// convert it to String form
				int modifier = c.getModifiers();
				System.out.println("Modifier: " + Modifier.toString(modifier));
			
				// get the number ofparameters in constructors
				System.out.println("Parameters: "+c.getParameterCount());
				System.out.println(" ");

			}

		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}