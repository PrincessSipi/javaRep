import java.util.Arrays;
public class LittleCritters{
	public static void main(String[] args){
		String [] bugs = {"cricket", "beetle", "ladybug"};
		String [] alias = bugs;
		System.out.println(bugs.equals(alias));
		System.out.println(Arrays.toString(bugs));
	}
}