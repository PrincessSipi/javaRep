import java.util.*;
import java.util.function.*;

public class ConsumersRFun{
	public static void main(String[] args){

		Consumer<String> consumer = x -> System.out.println(x);
		print(consumer, "Hello World");
	}

	
	private static void print(Consumer<String> consumer, String value){
		consumer.accept(value);
	}
	
	
}