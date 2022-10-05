import java.util.*;
import java.util.function.*;

public class SuppliersRFun{
	public static void main(String[] args){

		Supplier<Integer> number = () -> 42;
		System.out.println(returnNumber(number));
	}

	
	private static int returnNumber(Supplier<Integer> supplier){
		return supplier.get();
	}
	
	
}