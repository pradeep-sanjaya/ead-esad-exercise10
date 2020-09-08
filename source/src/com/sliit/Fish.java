package com.sliit;

public class Fish extends MealDecorator {

    public Fish(Meal meal) {
        this.meal = meal;
    }

    @Override
    public String getName() {
        return meal.getName() + ", Fish";
    }

    @Override
    public double getPrice() {
        return meal.getPrice() + 40;
    }
}
