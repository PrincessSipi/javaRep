class StrEquality{
	public static void main(String[] args){
		StringBuilder one = new StringBuilder();
		StringBuilder two = new StringBuilder();
		StringBuilder three = one.append("a");
		System.out.println(one == two);
		System.out.println(one == three);
		System.out.println();
		
		String e = "Hello World";
		String f = "Hello World";
		System.out.println(e == f);
		System.out.println();
		
		String c = "Hello World";
		String d = " Hello World".trim();
		System.out.println(c == d);
		System.out.println();

		String a = new String("Hello World");
		String b = "Hello World";
		System.out.println(a == b);
		System.out.println();

		String x = "Hello World";
		String z = " Hello World".trim();
		System.out.println(x.equals(z));

	
	}
}