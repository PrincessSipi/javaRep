public enum OnlyOne{
	
	ONCE(true);
	private OnlyOne(boolean b){
		System.out.println("constructing");
	}
	public static void main(String[] args){
		OnlyOne firstcall = OnlyOne.ONCE;
		OnlyOne secondcall = OnlyOne.ONCE;

	}
}

