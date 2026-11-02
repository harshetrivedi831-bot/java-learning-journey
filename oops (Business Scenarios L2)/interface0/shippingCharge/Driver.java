package interface0.shippingCharge;

public class Driver {
	public static void main(String[] args) {

		IShippable[] iShippable = { new StandardDelivery(), new ExpressDelievery() };
		for (int index = 0; index < iShippable.length; index++) {
			System.out.println(iShippable[index].getDelieveryType() + "delievey charge: rs:"
					+ iShippable[index].getShippingCharges());

		}
	}
}
