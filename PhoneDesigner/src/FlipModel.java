import java.util.ArrayList;

public class FlipModel extends Phone implements IRepairable {
	public FlipModel(ArrayList<Character> imei) {
		super("Flip Model", "HorseRacer 300", 3, "MB", 16, "GB", imei);
	}

	@Override
	public String howToRepair() {
		return "Replace screen";
	}

	@Override
	public double repairCost() {
		return 69.99;
	}
}
