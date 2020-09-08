package com.sliit;

public class DecoratorTest {
    public static void main(String[] args) {
        Meal meal = new Noodles();
        meal = new Chicken(meal);
        meal = new Fish(meal);
        meal = new Egg(meal);
        meal = new Vegetable(meal);

        System.out.println(meal.getName() + " => Rs. " + meal.getPrice());

        Meal meal2 = new Chicken(new Fish(new Egg(new Vegetable(new Bread()))));
        System.out.println(meal2.getName() + " => Rs. " + meal2.getPrice());

        Meal meal3 = new Fish(new Chicken(new Vegetable(new Egg(new Rice()))));
        System.out.println(meal3.getName() + " => Rs. " + meal3.getPrice());

        String description = new Egg(new Chicken(new Fish(new Noodles()))).getName();
        double price = new Egg(new Chicken(new Fish(new Noodles()))).getPrice();

        System.out.println(description + " => Rs. " + price);
    }
}
