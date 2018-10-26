
public enum Gastable {

		AIR (1.29, 1.01, -193), 
		O2 (1.43, 0.92, -183), 
		CH4 (0.72, 2.21, -161),
		CO2(1.98, 0.82, -78.3),
		CL2(3.21, 0.50, -34);

		double density;
		double heatcapacity;
		double boilpoint; 

		Gastable(double d, double hc, double b) {
			density = d;
			heatcapacity = hc * 1E3; // 1E3 = 1*10^3
			boilpoint = b;
		}

	}
