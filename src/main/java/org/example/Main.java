package org.example;

public class Main {
    public static void main(String[] args) {

        Member human = new Human();
        Member cat = new Cat();
        Member robot = new Robot();

        Obstacle racetrack = new Racetrack();
        Obstacle wall = new Wall();


        Member[] members = new Member[]{human, cat, robot };
        Obstacle[] obstacles = new Obstacle[]{wall, racetrack};

        for (Member m : members) {
            for (Obstacle o : obstacles) {
                o.overcome(m);
            }
        }



    }
}