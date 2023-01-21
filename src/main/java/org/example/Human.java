package org.example;

public class Human extends Member{

    public Human() {
        super(3, 3);
    }


    public void Fail(Obstacle o) {
        System.out.println("Human not pass " + o.getClass().getSimpleName() +" "+ o.vaule );
    }

    public void run(Obstacle o) {
        System.out.println("Human pass " + o.getClass().getSimpleName() +" "+ o.vaule );
    }


    public void jump(Obstacle o) {
        System.out.println("Human pass " + o.getClass().getSimpleName()+" "+ o.vaule);
    }
}
