
public class Exempel_Uppgifter {

	public static void main(String[] args) {
		
		// Uppgift 1, J�rnet
		System.out.println(enum_test.volumeToMass(Solidtable.IRON, 0.008) + " Kilogram");
		
		//Uppgift 2, Tomas l�per
		System.out.println(enum_test.svtDistance(2.8, 60) * 60 + " Meter");
		
		//Uppgift 3, Upphettning av vatten
		System.out.println(enum_test.heat(Fluidtable.WATER, 5, 1) + " Joule");
		
		//Uppgift 4, Trycket under havsytan
		System.out.println(enum_test.fluidpressure(Fluidtable.WATER, 100) + " Pascal");
		
		//Uppgift 5, Tomas kastar boll
		System.out.println(enum_test.velocityToHeight(50/3.6)+ 1.8 + " Meter");
		
		//Uppgift 6, Bilens effekt
		double velocity = 100/3.6;
		double acceleration = velocity/4.4; 
		double force = 740 * acceleration;
		double distance = enum_test.svtDistance(100/3.6, 4.4); 
		double work = enum_test.work(force, distance);
		System.out.println(enum_test.power(work, 4.4) + " Watt");
		
		//Uppgift 7, Studsbollen som bara f�rlorar 1% av sin energi och studsar 299 g�nger
		double hopp = 0;
		for (double i = 10; i > 0.5;) { 
			i = enum_test.velocityToHeight(enum_test.fallSpeed(i)) - (i/100); // Jag antar att 1% av bollens energi motsvarar 1% av h�jden den uppn�r. Jag antar �ven att vi tar 1% bort fr�n det som finns kvar, inte det vi b�rjade med
			hopp++;
			
		}
		System.out.println(hopp + " Antal g�nger");
		
		//Uppgift 8, Tomas hoppar fr�n ett 100 meter h�gt hopp torn (g�r inte detta hemma). Hur h�g fart kommer han upp i? 
		System.out.println(enum_test.fallSpeed(100) + " m/s");
		
		//Uppgift 9, Hur mycket energi tar det att v�rma upp 2 liter vatten fr�n 20 grader till 25 grader? (Anv�nder endast 1 metod) 
		System.out.println(Fluidtable.WATER.heatcapacity * 2 * Fluidtable.WATER.density * enum_test.delta(20, 25) + " Joule");
		
		//Uppgift 10, Du vill att 10000 cm^3 vatten som �r 18 grader celsius ska bli till �nga, hur mycket energi tar det? (Anv�nder metoder s� m�nga som det g�r)
		double vatten = enum_test.heat(Fluidtable.WATER, (10000/1000), enum_test.delta(18, 100));
		double anga = Fluidtable.WATER.steamEntalpy *  enum_test.volumeToMass(Fluidtable.WATER, 0.01); //Energin det tar att �verg� fr�n flytande medium till gas medium f�r vatten, allts� fr�n vatten till �nga.
		System.out.println(vatten + anga + " Joule");
		
		
	}
}
