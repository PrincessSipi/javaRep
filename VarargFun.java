public class VarargFun{

	public void walk1(int... nums){}
	public void walk2(int start, int... nums){}
	//public void walk3(int... nums, int start){} does not compile
	public void walk4(int... nums){}
	//public void walk5(int... nums, int... nums){} does not compile

	public static void walk(int start, int...nums){
		System.out.println(nums.length);

	}
	
	public static void run(int...nums){
		System.out.println(nums[1]);

	}
	

	public static void main(String[] args){
		walk(1);
		walk(1, 2);
		run(11, 22, 23);

	}
}