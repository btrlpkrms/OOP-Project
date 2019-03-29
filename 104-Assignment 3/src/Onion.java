
public class Onion implements PizzaDecor {
	private double cost = 2;
	private String comment = "soðanlý pizza olusturuldu \n";

	Onion() {
		explanation(); 
	}

	Onion(PizzaDecor decor) {
		cost += decor.cost();
		comment += decor.explanation();
	}

	public String explanation() {
		return comment;
	}

	public double cost() {
		return cost;
	}



	@Override
	public void printToppings() {
		// TODO Auto-generated method stub
		
	}
}
