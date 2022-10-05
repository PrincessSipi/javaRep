public enum Season1{
	WINTER{
		public void printHours(){ System.out.println("9.30am - 3pm");}
	},
	SPRING{
		public void printHours(){ System.out.println("9.30am - 5pm");}
	},
	SUMMER{
		public void printHours(){ System.out.println("9.30am - 7pm");}
	},
	FALL{
		public void printHours(){ System.out.println("9.30am - 5pm");}
	}
	public abstract void printHours();
}