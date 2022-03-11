package com.pizzamanagement.service;

import com.pizzamanagement.Dao.PizzaDao;
import com.pizzamanagement.Dao.PizzaDaoImpl;
import com.pizzamanagement.model.Pizza;

public class PizzaServiceImpl implements PizzaService{
	//creating the object of dao interface so that it can interact with service layer
	private PizzaDao dao; 
	public PizzaServiceImpl() {
		dao=new PizzaDaoImpl(); // initialising the dao object
	}
	// Unimplemented Methods
	@Override
	public void addPizza(Pizza pizza) {
		dao.beginTransaction();
		dao.addPizza(pizza);
		dao.commitTransaction();
		
	}
	@Override
	public void updatePizza(Pizza pizza) {
		dao.beginTransaction();
		dao.updatePizza(pizza);
		dao.commitTransaction();
		
	}
	@Override
	public void deletePizza(Pizza pizza) {
		dao.commitTransaction();
		dao.deletePizza(pizza);
		dao.beginTransaction();
		
	}
	@Override
	public Pizza findPizzaByNo(int id) {
		Pizza pizza =dao.getPizzaByNo(id);
		return pizza;
	}

}
