package org.example;

public abstract class Obstacle {

  public int vaule;

  public Obstacle(int vaule){
    this.vaule = vaule;
  }
  public abstract void overcome(Member m);

}
