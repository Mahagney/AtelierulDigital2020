package lab2.ch1;

public class Human {
    private int health;
    private String name;

    public Human(int health, String humanName){
        this.health = health;
        this.name = humanName;
    }

    public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
    }

    public void decreaseHealth(int damage){
        health=health-damage;
    }
}
