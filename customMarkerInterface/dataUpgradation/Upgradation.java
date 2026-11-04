package dataUpgradation;

public class Upgradation {
	public void upgrade(Object obj) {
		// before upgrading which is critical activity we will check 
		// whethere we cn upgradeor not using instanceof
		if(obj instanceof DataUpgradation) {
			System.out.println("upgrade the object");
		}
		else
		{
			System.out.println("upgradation is not allowed");
		}
	}

}
