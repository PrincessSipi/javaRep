import java.util.ArrayList;
import java.util.*;
public class CreatingArrayList{
	public static void main(String[] args){

		// old way of creating ArrayList still valid
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList(10);
		ArrayList list3 = new ArrayList(list2);

		// new improved way of creating ArrayList
		ArrayList<String> list4 = new ArrayList<String>();
		ArrayList<String> list5 = new ArrayList<>();

		// you can store ArrayList in a List reference variable
		// but not vice versa
		//List<String> list6 = new ArrayList<>();
		//ArrayList<String> list7 = new List<>();  // does not compile	
	}
}