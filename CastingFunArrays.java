public class CastingFunArrays{
	public static void main(String[] args){
		String [] strings = {"stringValue"};
		Object [] objects = strings;
		String [] againStrings = (String []) objects;
		//againStrings[0] = new StringBuilder(); // this does not compile
		//objects[0] = new StringBuilder(); // careful
	}
}