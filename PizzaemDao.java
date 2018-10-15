package com.pizza;

import java.util.Arrays;

public class PizzaemDao implements IpizzaDao{

	
        Pizza[] tabPizza;
	   
	   

	public PizzaemDao() {
		super();
		
		Pizza pizza1 = new Pizza("Marguerita", "mar", 10);
		Pizza pizza2= new Pizza("3 fromges", "fro", 12);
		Pizza pizza3= new Pizza("végétarien", "végé", 14);
		
		this.tabPizza[0] = pizza1;
		this.tabPizza[1] = pizza2;
		this.tabPizza[2] = pizza3;
		
	

		
		
	}


	@Override
	public Pizza[] findAllPizzas() {
		
		
		return null;
	}

	@Override
	public void  updatePizza(String codePizza, Pizza pizza) {
		
            
	}

	@Override
	public Pizza findPizzaByCode(String codePizza) {
		
                   Pizza result = null;
		
		
		for (int i = 0; i < tabPizza.length; i++)
		{
			Pizza pizza = tabPizza[i];
			
			if (pizza.getCode().equalsIgnoreCase(codePizza))
			{
				result = pizza;
			}
		}
		
		return result;
	
	}

	@Override
	public String toString() {
		return "PizzaemDao [tabPizza=" + Arrays.toString(tabPizza) + "]";
	}



	@Override
	public boolean isPizzaExists(String codePizza) {
		
Pizza pizza = this.findPizzaByCode(codePizza);
		
		/*
		if (pizza != null)
		{
			return true;
		}
		else
		{
			return false;
		}
		*/
		
		return pizza != null;
		
	
	}

}
