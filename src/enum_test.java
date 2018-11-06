import java.util.Scanner;

public class enum_test {

	static double g_swe = 9.82;
	static double R = 8.3144598;
	static double ATM = 101325;
	static double c = 299792458;
	static double G = 9.82;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
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
		System.out.println(svtVelocity(10, 5));
		System.out.println(svtDistance(10, 5));
		System.out.println(svtTime(10, 2));
		System.out.println(work(50, 10));
		System.out.println(power(1000, 2));
		System.out.println(heat(Solidtable.IRON, 1, 2));
		System.out.println(heat(Fluidtable.WATER, 1, 10));
		System.out.println(heat(Gastable.AIR, 1, 1));
		System.out.println(force(1, 9.82));
		System.out.println(distance(5, 10));
		System.out.println(friction(100, 0.8));
		System.out.println(pressure(250, 2));
		System.out.println(liftForce(Fluidtable.WATER, 0.02));
		System.out.println(efficiency(1000, 800));
		System.out.println(horsepower(1500));
		System.out.println(fluidToSteam(Fluidtable.WATER, 1));
		System.out.println(density(120, 3));
		System.out.println(solidToLiquid(Solidtable.IRON, 1));
	}

	public static double fahrenheitToCelsius(double fahrenheit) {

		double celsius = (fahrenheit - 32) / 1.8;

		return celsius;
	}

	public static double kelvinToCelsius(double kelvin) {

		double Celsius = kelvin - 273.15;

		return Celsius;
	}

	public static double fluidpressure(Fluidtable fluid, double deep) {
		double pressure = fluid.density * G * deep; // Ger inget v�rde i konsolen.

		return pressure;
	}

	public static double pressureUnderWater(double deep) {
		return fluidpressure(Fluidtable.WATER, deep); // En metod som endast anv�nder f�rra metoden fast s�tter in
														// v�tskan "WATER"
	}

	public static double kineticEnergy(double mass, double velocity) {
		double energy = (mass * velocity * velocity) / 2;

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

	public static double svtVelocity(double distance, double time) {
		double deltaV = distance / time;

		return deltaV;
	}

	public static double svtDistance(double velocity, double time) {
		double distance = velocity * time;

		return distance;
	}

	public static double svtTime(double distance, double velocity) {
		double time = distance / velocity;

		return time;
	}

	public static double work(double force, double distance) {
		double work = force * distance;

		return work;
	}

	public static double power(double work, double time) {
		double power = work / time;

		return power;
	}

	public static double heat(Solidtable solid, double mass, double deltaT) {
		double heat = solid.heatcapacity * mass * deltaT;

		return heat;
	}

	public static double heat(Fluidtable fluid, double volume, double deltaT) {
		double heat = fluid.heatcapacity * volume * fluid.density * deltaT;

		return heat;
	}

	public static double heat(Gastable gas, double volume, double deltaT) {
		double heat = gas.heatcapacity * volume * gas.density * deltaT;

		return heat;
	}

	public static double velocityToHeight(double velocity) {
		double height = (velocity / G) * (velocity / 2);

		return height;
	}

	public static double force(double mass, double acceleration) {
		double kraft = mass * acceleration;

		return kraft;

	}

	public static double distance(double time, double acceleration) {
		double distance = (time * time * acceleration) / 2;

		return distance;

	}

	public static double friction(double Fn, double My) {
		double FrictionForce = Fn * My;

		return FrictionForce;

	}

	public static double pressure(double force, double area) {
		double pressure = force / area;

		return pressure;

	}

	public static double liftForce(Fluidtable fluid, double volume) {
		double lift = fluid.density * g_swe * volume;

		return lift;

	}

	public static double efficiency(double inputEnergy, double usefulEnergy) {
		double efficiency = usefulEnergy / inputEnergy;

		return efficiency;

	}

	public static double horsepower(double watt) {
		double HK = watt / 735.5;

		return HK;

	}

	public static double fluidToSteam(Fluidtable fluid, double mass) {
		double joule = fluid.steamEntalpy * mass;

		return joule;

	}
	
	public static double density(double mass, double volume) {
		double density = mass/volume;
		
		return density;
		
	}
	
	public static double solidToLiquid(Solidtable solid, double mass) {
		double joule = solid.meltentalpy * mass;
		
		return joule;
		
	}

}
