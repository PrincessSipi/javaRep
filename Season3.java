public enum Season3{
	WINTER{
	public void printHours(){System.out.println("Short hours");}
	},
	SUMMER{
	public void printHours(){System.out.println("Long hours");}
	},
	SPRING,FALL;
	public void printHours(){System.out.println("Default hours");}
}