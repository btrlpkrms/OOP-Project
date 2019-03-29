
public class Neapolitan {
	private static double cost = 10;
	private String comment = "Napolitan pizza olusturuldu \n";

	Neapolitan() {
		explanation();
	}

	Neapolitan(PizzaDecor decor) {
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
		Neapolitan pizza = new Neapolitan(obje);
		
		return pizza;
		
	}
	public static double addDrink() {
		cost = cost + 2;
		return cost;
		
	}
	


}
