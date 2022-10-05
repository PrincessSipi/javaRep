class Spider extends Anthropod {
	protected void printName(int input){ // method overridding
		System.out.println("Spider");

	}

	public static void main(String [] args){	
		Anthropod a = new Spider();
		a.printName((short)4);	
		a.printName(4);
		a.printName(5L);

	}

}