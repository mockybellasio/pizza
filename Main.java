package com.pizza;

public class Main {

	public static <tabPizza> void main(String[] args) {
		
		Pizza pizza1 = new Pizza("Marguerita", "mar", 10, Modele.AUTRE);
		
		System.out.println(pizza1);
		
		Pizza pizza2= new Pizza("3 fromages", "fro", 12, Modele.FROMAGE);
   
		  System.out.println(pizza2);

	}

}
