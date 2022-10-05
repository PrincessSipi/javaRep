import java.util.ArrayList;
import java.util.List;
public class UsingArrayList1{
	public static void main(String[] args){
		List<String> birds = new ArrayList<>();
		birds.add("hawk");
		birds.add(1, "robin");
		birds.add(0, "blu jay");
		birds.add(1, "cardinal");
		System.out.println(birds);

		System.out.println(birds.remove("cardinal"));
		System.out.println(birds.remove("hawk"));
		System.out.println(birds.remove(0));
		System.out.println(birds);

		birds.add("hawk");
		System.out.println(birds.size());
		birds.set(0,"Osprey");
		System.out.println(birds.size());
		birds.set(1,"Flamingo");
		System.out.println(birds);

		System.out.println(birds.isEmpty());
		System.out.println(birds.size());

		birds.clear();
		System.out.println(birds.isEmpty());
		System.out.println(birds.size());

		birds.add("hawk");
		System.out.println(birds.contains("hawk"));
		System.out.println(birds.contains("robin"));
		

	}
}