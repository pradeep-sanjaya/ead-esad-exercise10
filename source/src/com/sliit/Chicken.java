package com.sliit;

public class Chicken extends MealDecorator {

    public Chicken(Meal meal) {
        this.meal = meal;
    }

    @Override
    public String getName() {
        return meal.getName() + ", Chicken";
    }

    @Override
    public double getPrice() {
        return meal.getPrice() + 50;
    }
}
