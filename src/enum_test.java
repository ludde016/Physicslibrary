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
	 * En metod som tar in ett antal grader i Fahrenheit och gör om det till Celsius
	 * 
	 * @param fahrenheit
	 * @return Celsius
	 */
	public static double fahrenheitToCelsius(double fahrenheit) {

		double celsius = (fahrenheit - 32) / 1.8;

		return celsius;
	}

	/**
	 * En metod som tar in ett antal grader Kelvin och gör om det till Celsius
	 * 
	 * @param kelvin
	 * @return Celsius
	 */
	public static double kelvinToCelsius(double kelvin) {

		double Celsius = kelvin - 273.15;

		return Celsius;
	}

	/**
	 * En metod som tar in en vätska och X djup och beräknar hur högt tryck det är
	 * på X djup i vätskan
	 * 
	 * @param fluid
	 * @param deep
	 * @return Trycket "deep" meter under ytan av "vätska" (Pascal/N per m^2)
	 */
	public static double fluidpressure(Fluidtable fluid, double deep) {
		double pressure = fluid.density * G * deep; // Ger inget värde i konsolen.

		return pressure;
	}

	/**
	 * En metod som använder sig av förra metoden fast sätter vätskan som
	 * "WATER"/vatten
	 * 
	 * @param deep
	 * @return Trycket "deep" meter under vattenytan (Pascal/N per m^2)
	 */
	public static double pressureUnderWater(double deep) {
		return fluidpressure(Fluidtable.WATER, deep); // En metod som endast använder förra metoden fast sätter in
														// vätskan "WATER"
	}

	/**
	 * En metod som räknar ut rörelseenergi utifrån hastigheten och massan hos
	 * föremålet
	 * 
	 * @param mass
	 * @param velocity
	 * @return Rörelseenergin (joule)
	 */
	public static double kineticEnergy(double mass, double velocity) {
		double energy = (mass * velocity * velocity) / 2;

		return energy;
	}

	/**
	 * En metod som beräknar potentiellenergi med massan på föremålet och dess höjd
	 * över vattenytan/marken/begärd startpunkt
	 * 
	 * @param mass
	 * @param height
	 * @return Potentiellenergi (joule)
	 */
	public static double potentialEnergy(double mass, double height) {
		double energy = mass * g_swe * height;

		return energy;
	}

	/**
	 * En metod som beräknar vad för hastighet ett föremål har precis innan det slår
	 * i marken när det släpps från höjden "height". OBS: Bortser från luftmotstånd
	 * 
	 * @param height
	 * @return hastighet (m/s)
	 */
	public static double fallSpeed(double height) {
		double speed = Math.sqrt(2 * G * height);

		return speed;
	}

	/**
	 * En metod som tar fram skillnaden mellan 2 angivna tal. Tar sista angivna
	 * talet minus första, t.ex input = 10, 5; output = -5;
	 * 
	 * @param first
	 * @param last
	 * @return Delta/skillnaden
	 */
	public static double delta(double first, double last) {
		double delta = last - first;

		return delta;
	}

	/**
	 * En metod som beräknar massan hos en vätska genom att ta in vad för vätska det
	 * är och vad för volym man har av den
	 * 
	 * @param fluid
	 * @param volume
	 * @return Massa (Kg)
	 */
	public static double volumeToMass(Fluidtable fluid, double volume) {
		double mass = fluid.density * volume;

		return mass;
	}

	/**
	 * En metod som beräknar massan hos ett fast ämne genom att ta in vad för fast
	 * ämne det är och vad för volym man har av den
	 * 
	 * @param gas
	 * @param volume
	 * @return Massa (Kg)
	 */
	public static double volumeToMass(Gastable gas, double volume) {
		double mass = gas.density * volume;

		return mass;
	}

	/**
	 * En metod som beräknar massan hos en gas genom att ta in vad för gas det är
	 * och vad för volym man har av den
	 * 
	 * @param solid
	 * @param volume
	 * @return Massa (Kg)
	 */
	public static double volumeToMass(Solidtable solid, double volume) {
		double mass = solid.density * volume;

		return mass;
	}

	/**
	 * En metod som beräknar medelhastighet utifrån distans och tid
	 * 
	 * @param distance
	 * @param time
	 * @return deltaV/medelhastighet (m/s)
	 */
	public static double svtVelocity(double distance, double time) {
		double deltaV = distance / time;

		return deltaV;
	}

	/**
	 * En metod som tar fram distans utifrån hastighet och tid
	 * 
	 * @param velocity
	 * @param time
	 * @return Distans (m)
	 */
	public static double svtDistance(double velocity, double time) {
		double distance = velocity * time;

		return distance;
	}

	/**
	 * En metod som räknar ut tid utifrån distans och hastighet
	 * 
	 * @param distance
	 * @param velocity
	 * @return Tid (s)
	 */
	public static double svtTime(double distance, double velocity) {
		double time = distance / velocity;

		return time;
	}

	/**
	 * En metod som beräknar arbetet som har utförts utifrån vad för kraft som har
	 * använts och vad för distans som har uppnåtts
	 * 
	 * @param force
	 * @param distance
	 * @return Arbete (Nm/Joule)
	 */
	public static double work(double force, double distance) {
		double work = force * distance;

		return work;
	}

	/**
	 * En metod som beräknar effekt utifrån vad för arbete som har utförts hur lång
	 * tid det tog
	 * 
	 * @param work
	 * @param time
	 * @return Effekt (W)
	 */
	public static double power(double work, double time) {
		double power = work / time;

		return power;
	}

	/**
	 * En metod som beräknar hur många joule det tar att värma upp ett fast ämne med
	 * en viss massa ett visst antal grader
	 * 
	 * @param solid
	 * @param mass
	 * @param deltaT
	 * @return Joule
	 */
	public static double heat(Solidtable solid, double mass, double deltaT) {
		double heat = solid.heatcapacity * mass * deltaT;

		return heat;
	}

	/**
	 * En metod som beräknar hur många joule det tar att värma upp en vätska med en
	 * viss massa ett visst antal grader
	 * 
	 * @param fluid
	 * @param volume
	 * @param deltaT
	 * @return Joule
	 */
	public static double heat(Fluidtable fluid, double volume, double deltaT) {
		double heat = fluid.heatcapacity * volume * fluid.density * deltaT;

		return heat;
	}

	/**
	 * En metod som beräknar hur många joule det tar att värma upp en gas med en
	 * viss massa ett visst antal grader
	 * 
	 * @param gas
	 * @param volume
	 * @param deltaT
	 * @return Joule
	 */
	public static double heat(Gastable gas, double volume, double deltaT) {
		double heat = gas.heatcapacity * volume * gas.density * deltaT;

		return heat;
	}

	/**
	 * En metod som beräknar vad för höjd ett föremål får när det åker rakt upp med
	 * en given hastighet. OBS: Precis som alla andra metoder bortser denna metod
	 * från luftmotstånd
	 * 
	 * @param velocity
	 * @return Höjd (m)
	 */
	public static double velocityToHeight(double velocity) {
		double height = (velocity / G) * (velocity / 2);

		return height;
	}

	/**
	 * En metod som beräknar vad för kraft som ett föremål utsätts för utifrån dess
	 * massa och dess acceleration
	 * 
	 * @param mass
	 * @param acceleration
	 * @return Kraft (N)
	 */
	public static double force(double mass, double acceleration) {
		double kraft = mass * acceleration;

		return kraft;

	}

	/**
	 * En metod till med tar fram distans fast denna gång med angiven tid och
	 * acceleration.
	 * 
	 * @param time
	 * @param acceleration
	 * @return Distans (m)
	 */
	public static double distance(double time, double acceleration) {
		double distance = (time * time * acceleration) / 2;

		return distance;

	}

	/**
	 * En metod som beräknar vad för friktionskraft ett föremål utsätts för utifrån
	 * normalkraften den utsätts för och friktionstalet (My) mellan dess yta och
	 * ytan som den har kontakt med. OBS: Ytan den har kontakt med kan inte vara 90
	 * grader/parallell med tyngkraftens riktning, då är beräkningen inkorrekt.
	 * 
	 * @param Fn
	 * @param My
	 * @return Friktionskraft (N)
	 */
	public static double friction(double Fn, double My) {
		double FrictionForce = Fn * My;

		return FrictionForce;

	}

	/**
	 * En metod som beräknar trycket genom att dela kraften med arean. T.ex kan man
	 * ta fram hur stort tryck du utsätter marken för genom att ta (din vikt *
	 * 9.82)/area dina fötter har tillsammans
	 * 
	 * @param force
	 * @param area
	 * @return Tryck (Pascal/N per m^2)
	 */
	public static double pressure(double force, double area) {
		double pressure = force / area;

		return pressure;

	}

	/**
	 * En metod som beräknar lyftkraften som ett föremål utsätts för när det ligger
	 * i en vätska utifrån föremålets volym
	 * 
	 * @param fluid
	 * @param volume
	 * @return Lyftkraft (N)
	 */
	public static double liftForce(Fluidtable fluid, double volume) {
		double lift = fluid.density * g_swe * volume;

		return lift;

	}

	/**
	 * En metod som beräknar verkningsgraden av t.ex en process genom att dela
	 * användbar energi med tillsatt energi. Svaret blir ett procenttal mellan 0 och
	 * 1
	 * 
	 * @param inputEnergy
	 * @param usefulEnergy
	 * @return Verkningsgrad (%)
	 */
	public static double efficiency(double inputEnergy, double usefulEnergy) {
		double efficiency = usefulEnergy / inputEnergy;

		return efficiency;

	}

	/**
	 * En metod som gör om effekt i form av watt till effekt i form av hästkrafter.
	 * 
	 * @param watt
	 * @return Hästkrafter (hk)
	 */
	public static double horsepower(double watt) {
		double HK = watt / 735.5;

		return HK;

	}

	/**
	 * En metod som beräknar hur mycket energi det går åt för en vätska att övergå
	 * till en gas. OBS: Vi antar att vätskan är vid sin kokpunkt, vill man ha
	 * totala mängden energi det tar inklusive uppvärmning så får man addera svaret
	 * från denna metod med svaret från metoden "heat" (den som använder sig av
	 * vätskor)
	 * 
	 * @param fluid
	 * @param mass
	 * @return Joule
	 */
	public static double fluidToSteam(Fluidtable fluid, double mass) {
		double joule = fluid.steamEntalpy * mass;

		return joule;

	}

	/**
	 * En metod som beräknar densitet utifrån massan och volymen av ämnet
	 * 
	 * @param mass
	 * @param volume
	 * @return Densitet (Kg/m^3)
	 */
	public static double density(double mass, double volume) {
		double density = mass / volume;

		return density;

	}

	/**
	 * En metod som beräknar hur mycket energi det tar för ett fast ämne att övergå
	 * till flytande form. OBS: Vi antar att ämnet är vid sin smältpunkt, vill man
	 * ha totala mängden energi det tar inklusive uppvärmning så får man addera
	 * svaret från denna metod med svaret från metoden "heat" (den som använder sig
	 * av fasta ämnen)
	 * 
	 * @param solid
	 * @param mass
	 * @return Joule
	 */
	public static double solidToLiquid(Solidtable solid, double mass) {
		double joule = solid.meltentalpy * mass;

		return joule;

	}

}
