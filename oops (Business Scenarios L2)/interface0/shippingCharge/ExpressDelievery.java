package interface0.shippingCharge;

public class ExpressDelievery implements IShippable{

	@Override
	public String getDelieveryType() {
		return "Express";
	}
	//change the default delivery charges in express mode
	@Override
	public double getShippingCharges() {
		return 120;
	}
}
