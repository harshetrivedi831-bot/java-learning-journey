package interface0.shippingCharge;

public interface IShippable {
String getDelieveryType();
default double getShippingCharges() {
	return 50;
}
}
