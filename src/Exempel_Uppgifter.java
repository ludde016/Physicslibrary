
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
		System.out.println(enum_test.power(enum_test.work(740*9.82, 100/3.6), 1) + "Watt"); //Fr�ga Joakim eller Tomas om denna
		
		//Uppgift 7, Studsbollen som bara f�rlorar 1% av sin energi och studsar 299 g�nger
		double hopp = 0;
		for (double i = 10; i > 0.5;) { 
			i = enum_test.velocityToHeight(enum_test.fallSpeed(i)) - (i/100); // Jag antar att 1% av bollens energi motsvarar 1% av h�jden den uppn�r. Jag antar �ven att vi tar 1% bort fr�n det som finns kvar, inte det vi b�rjade med
			hopp++;
			
		}
		System.out.println(hopp + " Antal g�nger");
		
	}
}
