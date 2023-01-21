package org.example;

public class Robot extends Member{


    public Robot() {
        super(1, 1);
    }


    public void Fail(Obstacle o) {
        System.out.println("Robot not pass " + o.getClass().getSimpleName()+" "+ o.vaule);
    }

    public void run(Obstacle o) {
        System.out.println("Robot pass " + o.getClass().getSimpleName()+" "+ o.vaule);
    }


    public void jump(Obstacle o) {
        System.out.println("Robot pass " + o.getClass().getSimpleName()+" "+ o.vaule);
    }
}

