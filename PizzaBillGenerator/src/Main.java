
public class Main {

	public static void main(String[] args) {
		Pizza basePizza = new Pizza(true);
		//basePizza.getPizzaPrice();
		//basePizza.addExtraCheese();
		//basePizza.addExtraToppings();
		//basePizza.takeAway();
		//basePizza.getBill();

		DeluxPizza dp = new DeluxPizza(true);
		//even in main(), calling this metthods it wont call because we have override those methods but those are empty
		dp.addExtraCheese();
		dp.addExtraToppings();
		//takeAway method will call as we are not overriding 
		dp.takeAway();
		dp.getBill();
	}

}
