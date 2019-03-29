
public class AmericanPan {
	private static double cost = 5;
	private String comment = "AmericanPanPizza olusturuldu \n";

	AmericanPan() {
		
		return;
	}

	AmericanPan(PizzaDecor decor) {
		cost += decor.cost();
		comment += decor.explanation();
	}
 
	public String explanation() {
		return comment;
	}

	public double cost() {
		return cost;
	}
	public static Object addTopping(PizzaDecor obje) {
		AmericanPan pizza = new AmericanPan(obje);
		
		return pizza;
		
	}
	public static double addDrink() {
		cost = cost + 2;
		return cost;
		
	}

	

}
