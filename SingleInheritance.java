package com.techment.demo;
class Animal{  
void eat(){
	System.out.println("EAT");
	}  
}  
class Dog extends Animal{  
void bark(){
	System.out.println("BARK");
	}  
}  

public class SingleInheritance {

	public static void main(String[] args) {
		Dog d=new Dog();  
		d.bark();  
		d.eat();  
		}  
	}


