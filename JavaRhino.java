public class JavaRhino extends Rhino{
	public String getName(){
		return "javarhino";
	}

	public CharSequence getColor(){ // does not compile
		return "grey, black, white";
	}
}