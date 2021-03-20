package InterfaceSegregationPrinciple;

public class Order implements IOrder {

	public void processOrder(String modelName) {
		System.out.println("Order Accepted " + modelName);
	}

}