package factoryPattern;

public class enemyShipFactory {
    public enemyShip makeShip(String type){
        if(type.equals("U")){
            return new UfoShip();
        }
        else if(type.equals("B")){
            return new BigUfo();
        }
        else{
            return null;
        }
    }
}
