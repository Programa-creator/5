package org.example;

public class Cat extends Member{

    public Cat() {
        super(4, 5);
    }


    public void Fail(Obstacle o) {
        System.out.println("Cat not pass " + o.getClass().getSimpleName()+" "+ o.vaule);
    }

    public void run(Obstacle o) {
        System.out.println("Cat pass " + o.getClass().getSimpleName()+" "+ o.vaule);
    }


    public void jump(Obstacle o) {
        System.out.println("Cat pass " + o.getClass().getSimpleName()+" "+ o.vaule);
    }
}
