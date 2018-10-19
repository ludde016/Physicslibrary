
public enum Fluidtable {
	
	WATER(0.998, 4.19, 0, 100, 2260),
	HG (13.55, 0.14, -39, 357, 296),
	CH3OH (0.791, 2.5, -98, 65, 1100 ),
	C2H5OH (0.789, 2.43, -117, 78.2, 841),
	H2SO4(1.84, 1.38, 10, 336, 511);
	
	double density;
	double heatcapacity;
	double smeltpoint;
	double boilpoint;
	double steamEntalpy; 

	
	Fluidtable (double fi, double c, double m, double b, double py){
		density = fi;
		heatcapacity = c;
		smeltpoint = m;
		boilpoint = b;
		steamEntalpy = py; 
	}
}
