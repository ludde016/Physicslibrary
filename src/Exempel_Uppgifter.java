
public class Exempel_Uppgifter {

	public static void main(String[] args) {
		
		// Uppgift 1, Järnet
		System.out.println(enum_test.volumeToMass(Solidtable.IRON, 0.008) + " Kilogram");
		
		//Uppgift 2, Tomas löper
		System.out.println(enum_test.svtDistance(2.8, 60) * 60 + " Meter");
		
		//Uppgift 3, Upphettning av vatten
		System.out.println(enum_test.heat(Fluidtable.WATER, 5, 1) + " Joule");
		
		//Uppgift 4, Trycket under havsytan
		System.out.println(enum_test.fluidpressure(Fluidtable.WATER, 100) + " Pascal");
		
		//Uppgift 5, Tomas kastar boll
		System.out.println(enum_test.velocityToHeight(50/3.6)+ 1.8 + " Meter");
		
		//Uppgift 6, Bilens effekt
		System.out.println(enum_test.power(enum_test.work(740*9.82, 100/3.6), 1) + "Watt"); //Fråga Joakim eller Tomas om denna
		
		//Uppgift 7, Studsbollen som bara förlorar 1% av sin energi och studsar 299 gånger
		double hopp = 0;
		for (double i = 10; i > 0.5;) { 
			i = enum_test.velocityToHeight(enum_test.fallSpeed(i)) - (i/100); // Jag antar att 1% av bollens energi motsvarar 1% av höjden den uppnår. Jag antar även att vi tar 1% bort från det som finns kvar, inte det vi började med
			hopp++;
			
		}
		System.out.println(hopp + " Antal gånger");
		
		//Uppgift 8, Tomas hoppar från ett 100 meter högt hopp torn (gör inte detta hemma). Hur hög fart kommer han upp i? 
		System.out.println(enum_test.fallSpeed(100) + " m/s");
		
		//Uppgift 9, Hur mycket energi tar det att värma upp 2 liter vatten från 20 grader till 25 grader? (Använder endast 1 metod) 
		System.out.println(Fluidtable.WATER.heatcapacity * 2 * Fluidtable.WATER.density * enum_test.delta(20, 25) + " Joule");
		
		//Uppgift 10, du vill att 10000 cm^3 vatten som är 18 grader celsius ska bli om till ånga, hur mycket energi tar det? (Använder metoder så mycket som det går)
		double vatten = enum_test.heat(Fluidtable.WATER, (10000/1000), enum_test.delta(18, 100));
		double anga = Fluidtable.WATER.steamEntalpy *  enum_test.volumeToMass(Fluidtable.WATER, 0.01); //Energin det tar att övergå från flytande medium till gas medium för vatten, alltså från vatten till ånga.
		System.out.println(vatten + anga + " Joule");
		
		
	}
}
