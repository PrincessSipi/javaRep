import java.lang.Class;
import java.lang.reflect.*;

class MethReflection{
	public static void main(String[] args){
		try{
			// create an object of Dog
			Dog dog = new Dog();

			// create an object of Class
			Class obj = dog.getClass();

			// using the object of the class to get
			// all declared methods of Dog

			Method[] methods = obj.getDeclaredMethods();

			// create an object of the Method Class
			for(Method m : methods){

				// get names of methods
				System.out.println("Method Name: " +m.getName());

				// get the access modifier of the methods
				int modifier = m.getModifiers();
				System.out.println("Modifier: " + Modifier.toString(modifier));
			
				// get the return types of methods
				System.out.println("Return Types: "+m.getReturnType());
				System.out.println(" ");

			}

		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}