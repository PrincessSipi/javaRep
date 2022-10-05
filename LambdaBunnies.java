import java. util.*;

public class LambdaBunnies{
	public static void main(String[] args){
		
		// program using removeIf() API with lambda
		List<String> bunnies = new ArrayList<>();
		bunnies.add("long ear");
		bunnies.add("floppy");
		bunnies.add("hoppy");
		bunnies.add("cutie");
		System.out.println(bunnies);
		
		// using sort()
		bunnies.sort((b1, b2) -> b1.compareTo(b2));
		System.out.println(bunnies);
		System.out.println();

		// using forEach()
		bunnies.forEach(b -> System.out.println(b));
		System.out.println(bunnies);
		System.out.println();

		// program using removeIf() API with lambda
		bunnies.removeIf(s -> s.charAt(0) != 'h');
		System.out.println(bunnies);
		
		
		
	}

}