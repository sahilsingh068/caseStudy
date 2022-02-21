package com.week3;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Set;
public class Product {
	private static int id;
	private String name;
	private int amount;
	private int code;
	private String address;
	private int pinCode;
	Scanner sc=new Scanner(System.in);
	HashMap<Integer, Product> hashMap=new HashMap<Integer,Product>();
	public void Product(int id,String name,int amount,int code,String address,int pinCode) {
		this.id=id;
		this.name=name;
		this.amount=amount;
		this.code=code;
		this.address=address;
		this.pinCode=pinCode;
	}
	public String toString() {
		return "Id:"+id+"Name:"+name+"Amount:"+amount+"Code:"+code+"Address"+address+"Pincode"+pinCode;
	}
	
	public void addProduct() {
		
		System.out.println("Enter Id:");
		int id=sc.nextInt();
		System.out.println("Enter name:");
		String name=sc.next();
		System.out.println("Enter amount");
		int amount=sc.nextInt();
		System.out.println("Enter Code");
		int code=sc.nextInt();
		System.out.println("Enter Address");
		String addressS=sc.next();
		System.out.println("Enter PinCode");
		int pinCode=sc.nextInt();
		System.out.println("Product added sucessfully!!!!");
		
	}
	public void updateProduct() {
		Product pr=new Product();
		pr=hashMap.get(id);
		System.out.println("Enter user choice to update product:");
		int update=sc.nextInt();
		switch (update) {
		case 1: {
			System.out.println("Enter new name:");
			pr.name=sc.next();
			System.out.println("Updated name:"+pr.name);
			break;
			
		}
		case 2:{
			System.out.println("Enter new amount:");
			pr.amount=sc.nextInt();
			System.out.println("Updated amount:"+pr.amount);
			break;
		}
		case 3: {
			System.out.println("Enter new code:");
			pr.name=sc.next();
			System.out.println("Updated code:"+pr.code);
			break;
		}
		case 4: {
			System.out.println("Enter new address:");
			pr.address=sc.next();
			System.out.println("Updated address:"+pr.address);
			break;
		}
		case 5: {
			System.out.println("Enter new pincode");
			pr.pinCode=sc.nextInt();
			System.out.println("Updated pincode:"+pr.pinCode);
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + update);
		}
		
		
		
	}
	public void deleteProduct() {
		hashMap.remove(id);
		System.out.println("Product deleted successfully!!!!");
		
	}
	public void getProduct() {
		System.out.println(hashMap.get(id));
		
	}
	public void getAllProduct() {
		for(int key:hashMap.keySet()) {
			System.out.println(hashMap.get(key));
		}
	}
	
	public static void main(String[] args) {
		HashMap<Integer, Product> hashMap=new HashMap<Integer,Product>();
		Product pr=new Product();
		System.out.println("Enter user choice");
		Scanner sc1=new Scanner(System.in);
		int input=sc1.nextInt();
		while(input!=0) {
			System.out.println("1 Add:");
			System.out.println("2 Update:");
			System.out.println("3 Delete:");
			System.out.println("4 Get:");
			System.out.println("5 Get All:");
			switch(input) {
			case 1: {
				System.out.println("Enter Details");
				int n=sc1.nextInt();
				pr.addProduct();
				System.out.println("Product added successfully");
				break;
			}
			case 2: {
				System.out.println("Enter Product id");
				int n = sc1.nextInt();
				hashMap.get(n).updateProduct();
				System.out.println("Product Updated Successfully \n");
				break;
			}
			case 4: {

				System.out.println("Enter a Product id");
				int n = sc1.nextInt();
				hashMap.remove(n);
				System.out.println("Product Deleted----->\n");
				break;
				
			}
			case 5: {
				System.out.println("Enter a Product id");
				int n = sc1.nextInt();
				System.out.println(hashMap.get(n));
				break;
				
			}
			case 6: {
				Set<Integer> s = hashMap.keySet();
				for (Object obj : s) {
					System.out.println(hashMap.get(obj));
				}
				break;
				
			}
			
			}	
			
		}
			
	}

}
