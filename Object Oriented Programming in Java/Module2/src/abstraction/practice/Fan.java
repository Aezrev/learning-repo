package abstraction.practice;

import java.awt.*;
import java.awt.event.AdjustmentListener;

public class Fan implements Switchable, Adjustable {
    @Override
    public void turnOn() {
        System.out.println("Fan is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is turned off.");
    }

    @Override
    public void increaseSpeed() {
        System.out.println("Fan speed increased.");
    }

    @Override
    public void decreaseSpeed() {
        System.out.println("Fan speed decreased.");
    }
}
