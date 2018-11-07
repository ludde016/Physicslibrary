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

	/**
	 * 
	 * @param fahrenheit
	 * @return
	 */
	public static double fahrenheitToCelsius(double fahrenheit) {

		double celsius = (fahrenheit - 32) / 1.8;

		return celsius;
	}

	/**
	 * 
	 * @param kelvin
	 * @return
	 */
	public static double kelvinToCelsius(double kelvin) {

		double Celsius = kelvin - 273.15;

		return Celsius;
	}

	/**
	 * 
	 * @param fluid
	 * @param deep
	 * @return
	 */
	public static double fluidpressure(Fluidtable fluid, double deep) {
		double pressure = fluid.density * G * deep; // Ger inget värde i konsolen.

		return pressure;
	}

	/**
	 * 
	 * @param deep
	 * @return
	 */
	public static double pressureUnderWater(double deep) {
		return fluidpressure(Fluidtable.WATER, deep); // En metod som endast använder förra metoden fast sätter in
														// vätskan "WATER"
	}

	/**
	 * 
	 * @param mass
	 * @param velocity
	 * @return
	 */
	public static double kineticEnergy(double mass, double velocity) {
		double energy = (mass * velocity * velocity) / 2;

		return energy;
	}

	/**
	 * 
	 * @param mass
	 * @param height
	 * @return
	 */
	public static double potentialEnergy(double mass, double height) {
		double energy = mass * g_swe * height;

		return energy;
	}

	/**
	 * 
	 * @param height
	 * @return
	 */
	public static double fallSpeed(double height) {
		double speed = Math.sqrt(2 * G * height);

		return speed;
	}

	/**
	 * 
	 * @param first
	 * @param last
	 * @return
	 */
	public static double delta(double first, double last) {
		double delta = last - first;

		return delta;
	}

	/**
	 * 
	 * @param fluid
	 * @param volume
	 * @return
	 */
	public static double volumeToMass(Fluidtable fluid, double volume) {
		double mass = fluid.density * volume;

		return mass;
	}

	/**
	 * 
	 * @param gas
	 * @param volume
	 * @return
	 */
	public static double volumeToMass(Gastable gas, double volume) {
		double mass = gas.density * volume;

		return mass;
	}

	/**
	 * 
	 * @param solid
	 * @param volume
	 * @return
	 */
	public static double volumeToMass(Solidtable solid, double volume) {
		double mass = solid.density * volume;

		return mass;
	}

	/**
	 * 
	 * @param distance
	 * @param time
	 * @return
	 */
	public static double svtVelocity(double distance, double time) {
		double deltaV = distance / time;

		return deltaV;
	}

	/**
	 * 
	 * @param velocity
	 * @param time
	 * @return
	 */
	public static double svtDistance(double velocity, double time) {
		double distance = velocity * time;

		return distance;
	}

	/**
	 * 
	 * @param distance
	 * @param velocity
	 * @return
	 */
	public static double svtTime(double distance, double velocity) {
		double time = distance / velocity;

		return time;
	}

	/**
	 * 
	 * @param force
	 * @param distance
	 * @return
	 */
	public static double work(double force, double distance) {
		double work = force * distance;

		return work;
	}

	/**
	 * 
	 * @param work
	 * @param time
	 * @return
	 */
	public static double power(double work, double time) {
		double power = work / time;

		return power;
	}

	/**
	 * 
	 * @param solid
	 * @param mass
	 * @param deltaT
	 * @return
	 */
	public static double heat(Solidtable solid, double mass, double deltaT) {
		double heat = solid.heatcapacity * mass * deltaT;

		return heat;
	}

	/**
	 * 
	 * @param fluid
	 * @param volume
	 * @param deltaT
	 * @return
	 */
	public static double heat(Fluidtable fluid, double volume, double deltaT) {
		double heat = fluid.heatcapacity * volume * fluid.density * deltaT;

		return heat;
	}

	/**
	 * 
	 * @param gas
	 * @param volume
	 * @param deltaT
	 * @return
	 */
	public static double heat(Gastable gas, double volume, double deltaT) {
		double heat = gas.heatcapacity * volume * gas.density * deltaT;

		return heat;
	}

	/**
	 * 
	 * @param velocity
	 * @return
	 */
	public static double velocityToHeight(double velocity) {
		double height = (velocity / G) * (velocity / 2);

		return height;
	}

	/**
	 * 
	 * @param mass
	 * @param acceleration
	 * @return
	 */
	public static double force(double mass, double acceleration) {
		double kraft = mass * acceleration;

		return kraft;

	}

	/**
	 * 
	 * @param time
	 * @param acceleration
	 * @return
	 */
	public static double distance(double time, double acceleration) {
		double distance = (time * time * acceleration) / 2;

		return distance;

	}

	/**
	 * 
	 * @param Fn
	 * @param My
	 * @return
	 */
	public static double friction(double Fn, double My) {
		double FrictionForce = Fn * My;

		return FrictionForce;

	}

	/**
	 * 
	 * @param force
	 * @param area
	 * @return
	 */
	public static double pressure(double force, double area) {
		double pressure = force / area;

		return pressure;

	}

	/**
	 * 
	 * @param fluid
	 * @param volume
	 * @return
	 */
	public static double liftForce(Fluidtable fluid, double volume) {
		double lift = fluid.density * g_swe * volume;

		return lift;

	}

	/**
	 * 
	 * @param inputEnergy
	 * @param usefulEnergy
	 * @return
	 */
	public static double efficiency(double inputEnergy, double usefulEnergy) {
		double efficiency = usefulEnergy / inputEnergy;

		return efficiency;

	}

	/**
	 * 
	 * @param watt
	 * @return
	 */
	public static double horsepower(double watt) {
		double HK = watt / 735.5;

		return HK;

	}

	/**
	 * 
	 * @param fluid
	 * @param mass
	 * @return
	 */
	public static double fluidToSteam(Fluidtable fluid, double mass) {
		double joule = fluid.steamEntalpy * mass;

		return joule;

	}
	
	/**
	 * 
	 * @param mass
	 * @param volume
	 * @return
	 */
	public static double density(double mass, double volume) {
		double density = mass/volume;
		
		return density;
		
	}
	
	/**
	 * 
	 * @param solid
	 * @param mass
	 * @return
	 */
	public static double solidToLiquid(Solidtable solid, double mass) {
		double joule = solid.meltentalpy * mass;
		
		return joule;
		
	}

}
