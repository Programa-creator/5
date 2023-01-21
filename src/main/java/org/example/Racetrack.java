package org.example;

public class Racetrack extends Obstacle{


    public Racetrack() {
        super(3);
    }

    public void overcome(Member m) {
        if(m.runs >= vaule){
            m.run(this);
        }
        else {
            m.Fail(this);
        }

    }
}
