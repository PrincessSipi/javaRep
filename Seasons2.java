public enum Seasons2{
	
	WINTER("low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");

	public static void main(String[] args){

		private String expectedVisitors;
		private Seasons2(String expectedVisitors){
			this.expectedVisitors = expectedVisitors;
		}
		public void printExpectedVisitors(){
			System.out.println(expectedVisitors);
		}]
		
		Seasons2.SUMMER.printExpectedVisitors();
	}
}
	