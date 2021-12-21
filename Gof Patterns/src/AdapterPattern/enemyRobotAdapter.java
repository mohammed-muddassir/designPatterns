package AdapterPattern;

public class enemyRobotAdapter implements enemyAttacker{
    enemyRobot theRobot;
    public enemyRobotAdapter(enemyRobot newRobot){
        theRobot=newRobot;
    }

    @Override
    public void fireWeapon() {

    }

    @Override
    public void driveForward() {

    }

    @Override
    public void assignDriver(String driverName) {

    }
}
