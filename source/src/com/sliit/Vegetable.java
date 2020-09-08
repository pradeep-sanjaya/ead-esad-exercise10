package com.sliit;

public class Vegetable extends MealDecorator {

    public Vegetable(Meal meal) {
        this.meal = meal;
    }

    @Override
    public String getName() {
        return meal.getName() + ", Vegetable";
    }

    @Override
    public double getPrice() {
        return meal.getPrice() + 20;
    }
}
