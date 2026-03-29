package abstraction.practice;

public class SmartSpeaker implements Switchable, Connectable, Volume{
    @Override
    public void turnOn() {
        System.out.println("SmartSpeaker is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartSpeaker is turned off.");
    }

    @Override
    public void connect() {
        System.out.println("SmartSpeaker is connected.");
    }

    @Override
    public void disconnect() {
        System.out.println("SmartSpeaker is disconnected.");
    }

    @Override
    public void increaseVol() {
        System.out.println("SmartSpeaker volume increased.");
    }

    @Override
    public void decreaseVol() {
        System.out.println("SmartSpeaker volume decreased.");
    }
}
