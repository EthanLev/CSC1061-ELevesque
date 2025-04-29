import java.util.ArrayList;

public class BarModel extends Phone implements IRepairable {
	public BarModel(ArrayList<Character> imei) {
		super("Bar Model", "DragonSlayer 600", 8, "MB", 32, "MB", imei);
	}

	@Override
	public String howToRepair() {
		return "Replace battery";
	}

	@Override
	public double repairCost() {
		return 49.99;
	}
}
