import java.util.Arrays;
public class Mammals{
	public static void main(String[] args){

	String [] mammals = {"monkeys", "chimp", "donkey"};
	System.out.println(mammals.length);
	System.out.println(mammals[0]);
	System.out.println(mammals[1]);
	System.out.println(mammals[2]);

	int [] numbers = new int[10];
	for(int i = 0; i < numbers.length; i++){
		numbers[i] = i + 5;
		System.out.println(numbers[i]);
	} 
	System.out.println(Arrays.toString(numbers));
	}
}