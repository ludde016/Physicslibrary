

public class Exempel_Uppgifter {
	
	public static void main(String[] args) {
		
		System.out.println(ViktJarn(0.008));
		System.out.println(TomasDistans(2.8, 3600));
	 
	}
	
	public static double ViktJarn(double deep) {
		
		return enum_test.volumeToMass(Solidtable.IRON, deep);
		
	}
	
public static double TomasDistans(double velocity, double time) {
		
		return enum_test.svtDistance(velocity, time);
		
 }

}
