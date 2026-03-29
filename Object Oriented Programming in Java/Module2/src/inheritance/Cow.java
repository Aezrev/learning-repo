package inheritance;

class Cow extends Animal {
    public Cow(String name){
        super(name);
    }
    public String sound() {
        return "Moo";
    }

    @Override
    public void setFood(String food) {
        super.setFood(food);
    }
}
