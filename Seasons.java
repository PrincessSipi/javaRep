public enum Seasons{
	
	WINTER, SPRING, SUMMER, FALL;

	public static void main(String[] args){
		Seasons summer = Seasons.SUMMER;
		switch(summer){
			case WINTER:
				System.out.println("Get out the sled!");
				break;
			case SUMMER:
				System.out.println("Time for the pool!");
				break;
			default:
				System.out.println("Is it Summer yet?");
				break;
		}

	}
}
	