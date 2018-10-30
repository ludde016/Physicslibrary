
public class Exempel_Uppgifter {

	public static void main(String[] args) {

		System.out.println(enum_test.volumeToMass(Solidtable.IRON, 0.008));
		System.out.println(enum_test.svtDistance(2.8, 60) * 60);
		System.out.println(enum_test.heat(Fluidtable.WATER, 5, 1));
		System.out.println(enum_test.fluidpressure(Fluidtable.WATER, 100));

	}
}
