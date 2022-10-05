public class AnonInnerInter{

	interface SaleTodayOnly{

		abstract int dollarsOff();
	}
	public int admission(int basePrice){

		SaleTodayOnly sale = new SaleTodayOnly(){
			public int dollarsOff(){
				return 3;	
			}
		};
		return basePrice - sale.dollarsOff();		
	}
}