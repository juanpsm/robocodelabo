package laboratorio;

import robocode.JuniorRobot;

public class Agressive extends AbstractStrategy {

	public Agressive(JuniorRobot labo17Robot) {
		super(labo17Robot);
	}
	
	@Override
	public void run() {
		robot.setColors(JuniorRobot.red, JuniorRobot.red, JuniorRobot.red, JuniorRobot.red, JuniorRobot.red);
	    robot.turnGunLeft(360);
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	@Override
	public void onScannedRobot() {
		robot.turnGunTo(robot.scannedAngle);
		robot.fire(1);
	}
	
	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	@Override
	public void onHitRobot() {
		robot.back(20);
		robot.ahead(50);
		robot.back(20);
		robot.ahead(50);
	}
	

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	@Override
	public void onHitByBullet() {
		robot.doNothing();
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	@Override
	public void onHitWall() {
		robot.turnRight(-robot.hitWallBearing);
		robot.ahead(100);
	}	
}
