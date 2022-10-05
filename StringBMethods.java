class StringBMethods{
	public static void main(String[] args){
		// StringBuilder methods
		StringBuilder sb = new StringBuilder("animals");
		String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
		int len = sb.length();
		char ch = sb.charAt(6);
		System.out.println(sub + " "+ len + " "+ ch);
		System.out.println();

		// Method chaining with append(); more methods insert(), reverse()etc
		StringBuilder sb1 = new StringBuilder().append(1).append("c");
		sb1.append("-").append(true);
		System.out.println(sb1);
		System.out.println();

		sb.insert(7,"-");
		sb.insert(0,"-");
		sb.insert(4,"-");
		System.out.println(sb);
		System.out.println();

		StringBuilder sb2 = new StringBuilder("abcdef");
		sb2.delete(1, 3);
		//sb2.deleteCharAt(5); this one throws an exception
		System.out.println(sb2);
		System.out.println();

		StringBuilder sb3 = new StringBuilder("ABC");
		sb3.reverse();
		System.out.println(sb3);
		String s = sb.toString();

		

	}
}