
public class HotPepper implements PizzaDecor {
	private double cost = 1;
	private String comment = "biberli pizza olusturuldu \n";

	HotPepper() {
		explanation();
	}

	HotPepper(PizzaDecor decor) {
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
