package oops;
interface MealPlan {}
class VegetarianMeal implements MealPlan {}
class VeganMeal implements MealPlan {}
class KetoMeal implements MealPlan {}

class Meal<T extends MealPlan> {
    T meal;
    public Meal(T meal) { this.meal = meal; }
}

class MealGenerator {
    public static <T extends MealPlan> void generateMeal(T plan) {
        System.out.println("Meal generated: " + plan.getClass().getSimpleName());
    }
}
