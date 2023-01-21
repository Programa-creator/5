package org.example;

public abstract class Member {

    public int jumps, runs;

    public Member(int jumps, int runs){
        this.jumps = jumps;
        this.runs = runs;
    }

    public abstract void Fail(Obstacle o);
    public abstract void run(Obstacle o);
    public abstract void jump(Obstacle o);

}

