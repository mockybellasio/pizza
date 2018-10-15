package com.pizza;

public interface IpizzaDao {
	
	Pizza[] findAllPizzas();
	void updatePizza(String codePizza, Pizza pizza);
	Pizza findPizzaByCode(String codePizza);
	boolean isPizzaExists(String codePizza);
}
