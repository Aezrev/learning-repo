package inheritance;

public class Animal {
    private String name;
    private String food;
    public Animal(String name) {
        this.name = name;
    }
    public String sound() {
        return null;
    }
    public String toString() {
        return name.concat(" says ").concat(sound());
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }
}

