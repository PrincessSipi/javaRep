public class AnonInnerArg{

	interface SaleTodayOnly{

		abstract int dollarsOff();
	}
	public int pay(){
		return admission( 5, new SaleTodayOnly(){
			public int dollarsOff(){return 3;}
		});
	}
public int admission(int basePrice, SaleTodayOnly sale){
	return basePrice -sale.dollarsOff();
}
}


// Anonymous class as an argument of a method