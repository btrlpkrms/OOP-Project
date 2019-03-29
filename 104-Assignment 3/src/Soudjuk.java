
public class Soudjuk implements PizzaDecor {
	private double cost = 3;
	private String comment = "sucuklu pizza olusturuldu \n";

	Soudjuk() { 
		explanation();
	}

	Soudjuk(PizzaDecor decor) {
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
