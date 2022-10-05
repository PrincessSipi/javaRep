import java.util.Arrays;
public class MultiDimArray{
	public static void main(String[] args){
		// creating a multidimensional array
		int[][] vars1;   // a 2D array
		int vars2 [][];  // a 2D array
		int[] vars3[];   // a 2D array
		int[] vars4[], space[][];  // a 2D and a 3D array

		String[][] rectangle = new String[3][2];
		rectangle[0][1] = "set";
		for(String[] array : rectangle){
			for(String arr :array){
				System.out.print(arr + "");
			System.out.println();
			}
		}
		System.out.println(Arrays.toString(rectangle));
		int[][] differentSize = {{1, 4},{3},{9, 8, 7}};

		// another way to create an asymmetric array
		int[][] args = new int[4][];
		args[0] = new int[5];
		args[1] = new int[3];
	}
}