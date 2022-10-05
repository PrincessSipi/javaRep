public enum Season{
	
	WINTER, SPRING, SUMMER, FALL;

	public static void main(String[] args){
	
		Season s = Season.SUMMER;
		System.out.println(Season.SUMMER);
		System.out.println(s == Season.SUMMER);

		for(Season season: Season.values()){

			System.out.println(season.name() +" "+ season.ordinal());
		}

		Season s1 = Season.valueOf("SUMMER");
	}
}