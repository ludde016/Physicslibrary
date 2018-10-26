
public enum Solidtable {

	ICE (0.92, 2.2, 0, 334),
	IRON (7.87, 0.45, 1538, 276),
	COPPER (8.96, 0.39, 1085, 205),
	TUNGSTEN (19.3, 0.13, 3422, 192),
	GOLD (19.3, 0.13, 1064, 66); 
	

	double density;
	double heatcapacity;
	double meltpoint;
	double meltentalpy;
	
	Solidtable(double d, double hc, double sp, double se) {
		density = d * 1E3;
		heatcapacity = hc * 1E3; // For 1kg
		meltpoint = sp;
		meltentalpy = se * 1E3;
	}

}
