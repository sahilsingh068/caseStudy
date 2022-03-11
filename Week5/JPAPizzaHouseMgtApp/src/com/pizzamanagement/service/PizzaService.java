package com.pizzamanagement.service;

import com.pizzamanagement.model.Pizza;

public interface PizzaService {
	// CRUD OPERATIONS for pizza
	void addPizza(Pizza pizza);
	void updatePizza(Pizza pizza);
	void deletePizza(Pizza pizza);
	Pizza findPizzaByNo(int id);
	

}
