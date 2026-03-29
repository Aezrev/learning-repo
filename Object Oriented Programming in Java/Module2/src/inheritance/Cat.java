package inheritance;

class Cat extends Animal {
    public Cat(String name){
        super(name);
    }
    public String sound() {
        return "Meow";
    }

    @Override
    public void setFood(String food) {
        super.setFood(food);
    }
}
