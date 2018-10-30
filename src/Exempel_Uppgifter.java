

public class Exempel_Uppgifter {
	
	public static void main(String[] args) {
		
		System.out.println(ViktJarn(0.008));
	 
	}
	
	public static double ViktJarn(double deep) {
		
		return enum_test.volumeToMass(Solidtable.IRON, deep);
		
	}

}
