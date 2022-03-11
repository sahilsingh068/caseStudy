package com.pizzamanagement.Ui;


import com.pizzamanagement.model.Pizza;
import com.pizzamanagement.service.PizzaService;
import com.pizzamanagement.service.PizzaServiceImpl;

public class Test {
	public static void main(String[] args) {
		PizzaService service=new PizzaServiceImpl();
		// ADD VALUES TO THE PIZZA STORE 
		Pizza pizza=new Pizza(111,"mexican",400,"jaipur");
		Pizza pizza1=new Pizza(112,"peppy paneer",500,"jammu");
		Pizza pizza2=new Pizza(113,"margherita",600,"delhi");
		service.addPizza(pizza);
		service.addPizza(pizza1);
  	    service.addPizza(pizza2);
		
		
		
	    //UPDATING THE VALUES
  	    Pizza pizza4=new Pizza(114,"farmhouse",700,"ramban");
  	    service.updatePizza(pizza4);
  	    System.out.println("update No: "+pizza4.getPizzaNo());
  	    System.out.println("update Type: "+pizza4.getPizzaType());
  	    System.out.println("update price: "+pizza4.getPizzaPrice());
  	    System.out.println("update address :"+pizza4.getDeliveryAdd());
  	    
		
		// FIND
		pizza=service.findPizzaByNo(113);
		System.out.println("Pizza No:" +pizza.getPizzaNo());
		System.out.println("Type:" +pizza.getPizzaType());
		System.out.println("Price:" +pizza.getPizzaPrice());
		System.out.println("Address:" +pizza.getDeliveryAdd());
		
		// DELETING THE VALUES
		service.deletePizza(pizza);
		
		
		
		
		
	}

}
