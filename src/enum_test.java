import java.util.Scanner;

public class enum_test {

	static double g_swe = 9.82;
	static double R = 8.3144598;
	static double ATM = 101325;
	static double c = 299792458;
	static double G = 9.82;
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in); 
		double intag = input.nextDouble(); 
		
		System.out.println(fahrenheitToCelsius(intag));
		System.out.println(kelvinToCelsius(intag));
		System.out.println(pressureUnderWater(10));
		System.out.println(kineticEnergy(2, 2));
		System.out.println(potentialEnergy(2, 5));
		System.out.println(delta(1, 10));
		System.out.println(fallSpeed(2.5));
		System.out.println(volumeToMass(Fluidtable.WATER, 1));
		System.out.println(volumeToMass(Gastable.AIR, 1));
		System.out.println(volumeToMass(Solidtable.IRON, 1));
	}

	public static double fahrenheitToCelsius(double fahrenheit) {
		
		double celsius = (fahrenheit - 32)/1.8;

		return celsius;
	}

	public static double kelvinToCelsius(double kelvin) {
		
		double Celsius = kelvin - 273.15; 
		
		return Celsius; 
	}
	
	public static double fluidpressure(Fluidtable fluid, double deep) {
		double pressure = fluid.density * G * deep; // Ger inget värde i konsolen. 
		
		return pressure; 
	}
	
	public static double pressureUnderWater(double deep) {
		return fluidpressure(Fluidtable.WATER, deep); // En metod som endast använder förra metoden fast sätter in vätskan "WATER"
	}

	public static double kineticEnergy(double mass, double velocity) {
		double energy = (mass * velocity * velocity)/2;
		
		return energy; 
	}
	
	public static double potentialEnergy(double mass, double height) {
		double energy = mass * g_swe * height;
		
		return energy; 
	}
	
	public static double fallSpeed(double height) {
		double speed = Math.sqrt(2 * G * height);
		
		return speed;
	}
	
	public static double delta(double first, double last) {
		double delta = last - first;
		
		return delta;
	}
	
	public static double volumeToMass(Fluidtable fluid, double volume) {
		double mass = fluid.density * volume;
		
		return mass; 
	}
	
	public static double volumeToMass(Gastable gas, double volume) {
		double mass = gas.density * volume;
		
		return mass;
	}
	
	public static double volumeToMass(Solidtable solid, double volume) {
		double mass = solid.density * volume;
		
		return mass;
	}
	
}
