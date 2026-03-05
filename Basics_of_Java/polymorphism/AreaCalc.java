package polymorphism;

public class AreaCalc {
	public static double CalcArea(double side){

		double res= side*side;
		return res;
	}
	public static double CalcArea(double len, double breadth) {
	
		double res= len * breadth;
		return res;
	}
	public static float CalcArea(float radius) {
	
		return (float) (3.14 * radius*radius);
	}

}
