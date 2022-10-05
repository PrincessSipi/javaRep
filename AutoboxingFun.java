import java.util.List;
import java.util.ArrayList;
public class AutoboxingFun{
	public static void main(String[] args){
		List<Double> weights = new ArrayList<>();
		weights.add(50.5);  // this line autoboxes the primitive to a Double object
		//weights.add(new Double(60));  // you can still use the old method this one.(gives a deprecated warning)
		weights.remove(50.5);  // again autoboxing here
		double first = weights.get(0);

		List<Integer> heights = new ArrayList<>();
		heights.add(null);
		//int h = heights.get(0);   Null pointerException

		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.remove(1);  // this removes the element at index 1
		System.out.println(numbers);

		//numbers.remove(new Integer(2));  // to remove 2 use this method (gives a deprecated warning)
		numbers.add(2);
		System.out.println(numbers);
	}
}