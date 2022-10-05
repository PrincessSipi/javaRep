enum Sizes5{
	SMALL{
		// overiding toString() method for SMALL
		public String toString(){
			return "The size is small";
		}
	},
	MEDIUM{
		// overiding toString() method for MEDIUM
		public String toString(){
			return "The size is medium";
		}
	};	
}

class Size5{
	public static void main(String[] args){
		System.out.println(Sizes5.MEDIUM.toString());
	
	}
}