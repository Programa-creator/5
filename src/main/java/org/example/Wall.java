package org.example;

public class Wall extends Obstacle{


    public Wall() {
        super(4);
    }

    public void overcome(Member m) {
        if(m.jumps >= vaule){
            m.jump(this);
        }
        else {
            m.Fail(this);
        }

    }
}
