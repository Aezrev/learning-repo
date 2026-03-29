package inheritance;

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public String sound() {
        return "Woof";
    }

    @Override
    public void setFood(String food) {
        super.setFood(food);
    }
}


