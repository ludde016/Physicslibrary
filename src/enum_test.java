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
	}

	public static double fahrenheitToCelsius(double fahrenheit) {
		
		double celsius = (fahrenheit - 32)/1.8;

		return celsius;
	}

	public static double kelvinToCelsius(double kelvin) {
		
		double Celsius = kelvin - 273.15; 
		
		return Celsius; 
	}
	
	
}
