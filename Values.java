import java.util.List;
import java.util.ArrayList;
public class Values{
	public static void main(String[] args){
		List<String> values = new ArrayList<String>();
		values.add("Lisa");
		values.add("Joel");
		values.add("Mirna");
		for(String value : values){
			System.out.print(value + ", ");
		}

	}
}