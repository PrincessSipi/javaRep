public class Animal{
	private String species;
	private boolean canHop;
	private boolean canSwim;

	public Animal(String speciesName, boolean hopper, boolean swimmer){
		species = speciesName  ;
		canHop = hopper ;
		canSwim = swimmer ;
	}

	public String toString(){return species;}
	public boolean canHop(){return canHop;}
	public boolean canSwim(){return canSwim;}
}