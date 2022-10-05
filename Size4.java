enum Sizes4{
	SMALL, MEDIUM, LARGE, EXTRALARGE
}

class Size4{
	public static void main(String[] args){
		System.out.println("String value of SMALL is " + Sizes4.SMALL.toString());
		System.out.println("String value of MEDIUM is " + Sizes4.MEDIUM.name());
	}
}