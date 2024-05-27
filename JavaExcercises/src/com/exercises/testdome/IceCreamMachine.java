package com.exercises.testdome;

import java.util.ArrayList;
import java.util.List;

public class IceCreamMachine {
    public String[] ingredients;
    public String[] toppings;

    public static class IceCream {
        public String ingredient;
        public String topping;

        public IceCream(String ingredient, String topping) {
            this.ingredient = ingredient;
            this.topping = topping;
        }
    }

    public IceCreamMachine(String[] ingredeints, String[] toppings) {
        this.ingredients = ingredeints;
        this.toppings = toppings;
    }

    //Ice cream is an inner class, that's why the scoops methos of IceCream type can access the ingredients and
    //topings parameters of the IceCreamMachine class
    public List<IceCream> scoops() {
        List<IceCream> result = new ArrayList<>();
        for (String ingredient : ingredients) {
            for (String topping : toppings) {
                result.add(new IceCream(ingredient, topping));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        IceCreamMachine machine = new IceCreamMachine(new String[]{
                "vanilla", "chocolate"
        }, new String[]{
                "chocolate sauce"
        });
        IceCreamMachine machine2 = new IceCreamMachine(new String[]{
                "strawberry", "banana"
        }, new String[]{
                "blueberry sauce"
        });

        //The key of this exercise is that the "scoops" method is called using the "machine" object,
        //that is how the scoops methos knows what are the ingredients and toppings.
        List<IceCream> scoops = machine.scoops();
        List<IceCream> scoops2 = machine2.scoops();


        /*
         * Should print:
         * vanilla, chocolate sauce
         * chocolate, chocolate sauce
         */
        for (IceCream iceCream : scoops) {
            System.out.println(iceCream.ingredient + ", " + iceCream.topping);
        }
        for (IceCream iceCream : scoops2) {
            System.out.println(iceCream.ingredient + ", " + iceCream.topping);
        }
    }
}