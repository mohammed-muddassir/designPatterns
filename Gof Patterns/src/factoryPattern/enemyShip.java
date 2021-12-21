package factoryPattern;
import java.util.*;
public abstract class enemyShip {
    private String name;
    private double damage;

    public String getName(){
        return name;
    }
    public void setName(String newName){
        name=newName;
    }

    public void setDamage(double newDamage){
        damage=newDamage;
    }
    public double getDamage(){
        return damage;
    }

    public void display(){
        System.out.println("from "+getName());
    }


}
