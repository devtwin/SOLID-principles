package InterfaceSegregationPrinciple;

public class Repair implements IAccessoryRepair, IPhoneRepair {

	public void processPhoneRepair(String modelName) {
		System.out.println("Repair accepted " + modelName);
	}

	public void processAccessoryRepair(String accessoryType) {
		System.out.println("Repair Accepted " + accessoryType);
	}

}