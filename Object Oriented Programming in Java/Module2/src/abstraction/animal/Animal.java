package abstraction.animal;

public abstract class Animal {
    private String name;
    private String food;

    public Animal(String name) {
        this.name = name;
    }

    public String sound() {
        return null;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getFood(){
        return this.food;
    }

    public String toString() {
        return name.concat(" says ").concat(sound().concat(" and eats ").concat(food));
    }
}


