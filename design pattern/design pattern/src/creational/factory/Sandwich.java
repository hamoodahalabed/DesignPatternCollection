package creational.factory;

public class Sandwich {
    private String name;
    private int calories;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void create () {
        System.out.println("creating " + name + " sandwich with " + calories + " calories.");
    }
}
