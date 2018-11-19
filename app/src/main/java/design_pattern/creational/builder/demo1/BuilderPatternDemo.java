package design_pattern.creational.builder.demo1;

/**
 * BuiderPatternDemo使用MealBuider来演示构建器模式。
 */

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost:" + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNoe-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost:" + nonVegMeal.getCost());
        /**
         Veg Meal
         Item:Veg Burger,Packing:Wrapper,Price:25.0
         Item:Coke,Packing:Bottle,Price:30.0
         Total Cost:55.0

         Noe-Veg Meal
         Item:Chicken Burger,Packing:Wrapper,Price:59.5
         Item:Pepsi,Packing:Bottle,Price:35.0
         Total Cost:94.5
         */
    }
}
