package com.sliit;

public class Egg extends MealDecorator {

    public Egg(Meal meal) {
        this.meal = meal;
    }

    @Override
    public String getName() {
        return meal.getName() + ", Egg";
    }

    @Override
    public double getPrice() {
        return meal.getPrice() + 30;
    }
}