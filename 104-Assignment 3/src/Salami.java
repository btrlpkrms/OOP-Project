
public class Salami implements PizzaDecor {
	private double cost = 3;
	private String comment = "salamlý pizza olusturuldu \n";

	Salami() { 
		explanation();
	}

	Salami(PizzaDecor decor) {
		cost += decor.cost();
		comment += decor.explanation();
	}

	public String explanation() {
		return comment;
	}

	public double cost() {
		return cost;
	}

	
	public void printToppings() {
		
		
	}

}
