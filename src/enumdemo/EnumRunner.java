/*
Copyright 2010 kiddy
*/
package enumdemo;

import enumdemo.InterfaceFoodEnum.Dessert;

public class EnumRunner {
	public static void main(String[] args) {
		InterfaceFoodEnum food = Dessert.FRUIT;
		System.out.println("The food is " + food.getName());
		System.out.println(InterfaceFoodEnum.DEFAULT_NAME);
	}
}
