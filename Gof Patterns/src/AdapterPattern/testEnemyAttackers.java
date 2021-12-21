//Adapter patterns are nothing but like assigning new roles to a character
package AdapterPattern;

public class testEnemyAttackers {
    public static void main(String[] args) {
        enemyTank rx8=new enemyTank();
        enemyRobot fredTheRobot=new enemyRobot();
        enemyAttacker robotAdapt=new enemyRobotAdapter(fredTheRobot);

        //=========================
        fredTheRobot.react("eren");
        fredTheRobot.walkForward();
        fredTheRobot.smash();

        rx8.assignDriver("Armin");
        rx8.driveForward();
        rx8.fireWeapon();

        robotAdapt.assignDriver("erwin");
        robotAdapt.fireWeapon();
        robotAdapt.fireWeapon();

    }
}
