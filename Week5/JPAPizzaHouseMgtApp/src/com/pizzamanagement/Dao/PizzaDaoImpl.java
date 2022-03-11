package com.pizzamanagement.Dao;

import javax.persistence.EntityManager;

import com.pizzamanagement.model.Pizza;

public class PizzaDaoImpl implements PizzaDao{
	private EntityManager entityManager;
	// implementation of services added on PizzaDao interface
	public PizzaDaoImpl() {
		entityManager=JPAUtil.getEntityManger();
	}
	// adding pizza to the Pizza class in com.pizzamanagement.model
	@Override
	public void addPizza(Pizza pizza) {
		entityManager.persist(pizza);
		
	}
	// updating pizza
	@Override
	public void updatePizza(Pizza pizza) {
		entityManager.merge(pizza);
		
	}
	// delete pizza
	@Override
	public void deletePizza(Pizza pizza) {
		entityManager.remove(pizza);
		
	}
	// find pizza
	@Override
	public Pizza getPizzaByNo(int id) {
		Pizza pizza=entityManager.find(Pizza.class, id);
		return pizza;
	}
	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}
	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}

}
