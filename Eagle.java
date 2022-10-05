public class Eagle extends Bird{
	public int fly(int altitude){
		System.out.println("Bird is flying at altitude of "+ altitude+" meters");
		return altitude;
	}

	public int eat(int food){// Does not compile same signature as in parent class diff return type
		System.out.println("Bird is eating " + food +" units of food.");
		return food;
	}
}