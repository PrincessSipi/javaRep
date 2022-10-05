import java.util.Arrays;
public class TwoSumArray{	

	public static int [] twosum_array(int [] firstArray){
			int [] result = new int[3];
			for (int i = 0; i < firstArray.length; i++){
				for (int j = 0; j < firstArray.length; j++){
					if(i != j & firstArray[i] + firstArray[j] == 10){
						result[i] = firstArray[i];
						result[j] = firstArray[j];
					}
				}
			}
			return result;

		}	

	public static void main(String[] args){
		
		int [] s = {6, 1, 4, 2};
		int [] result = twosum_array(s);
		System.out.println(Arrays.toString(result));
	}
}