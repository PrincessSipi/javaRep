import java.util.Arrays;
public class Intersection{	

	public static int [] intersection_array(int [] firstArray,int [] secondArray){
			int [] result = new int[3];
			for (int i = 0; i < firstArray.length; i++){
				for (int j = 0; j < secondArray.length; j++){
					if(firstArray[i] == secondArray[j]){
						result[i]=firstArray[i];
					}
				}
			}
			return result;

		}	

	public static void main(String[] args){
		
		int [] s = {3, 1, 4, 2};
		int [] p = {4, 5, 3, 6};
		int [] result = intersection_array(s, p);
		System.out.println(Arrays.toString(result));
	}
}