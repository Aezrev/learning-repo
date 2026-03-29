package abstraction.bulb;

// RegularBulb class implementing one interface
class RegularBulb implements Switchable {
    private boolean isOn = false;

    // Switchable methods
    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("RegularBulb is turned ON.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("RegularBulb is turned OFF.");
    }
}
