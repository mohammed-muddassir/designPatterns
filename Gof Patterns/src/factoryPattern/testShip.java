package factoryPattern;
//used to create classes at runtime
//to encapsulate object creation
import java.util.Scanner;
public class testShip {
    public static void doStuff(enemyShip newEnemy){
        newEnemy.display();

    }
    public static void main(String[] args) {
        enemyShipFactory shipFactory=new enemyShipFactory();
        enemyShip theEnemy=null;
        Scanner inp=new Scanner(System.in);
        System.out.print("what type of ship(U/B) :");
        if(inp.hasNextLine()){
            String type=inp.nextLine();
            theEnemy=shipFactory.makeShip(type);
            if(theEnemy!=null){
                doStuff(theEnemy);
            }
        }
    }
}
