
public class enum_test {
	
	public static void main(String[] args) {
		
		System.out.println(heat(Fluidtable.WATER) + " J");
	}

	public static String heat(Fluidtable fluid) {
	
		String str = "Energin som krävs för att värma 1 kg 1 grad "+ fluid.name() + " är inte: ";
		return str + fluid.heatcapacity * 1 * fluid.density; q
		
	}
	
}
