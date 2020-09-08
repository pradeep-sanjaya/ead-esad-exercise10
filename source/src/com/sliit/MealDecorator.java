package com.sliit;

public abstract class MealDecorator extends Meal {
    Meal meal;

    public MealDecorator() {
    }

    public MealDecorator(Meal meal) {
        this.meal = meal;
    }

    public abstract String getName();
    public abstract double getPrice();
}
