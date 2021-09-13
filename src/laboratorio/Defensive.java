package laboratorio;

import robocode.JuniorRobot;

public class Defensive extends AbstractStrategy{

	
	public Defensive(JuniorRobot labo17Robot) {
		super(labo17Robot);
	}
	
	@Override
	public void run() {
		robot.setColors(JuniorRobot.blue, JuniorRobot.red, JuniorRobot.red, JuniorRobot.red, JuniorRobot.red);
	    robot.ahead(4000);
		robot.turnGunLeft(360);
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	@Override
	public void onScannedRobot() {
		robot.turnGunTo(robot.scannedAngle);
		robot.fire(3);
		robot.turnGunTo(robot.heading);
		robot.back(100);
		robot.turnLeft(90);
		
	}
	
	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	@Override
	public void onHitRobot() {
		robot.back(100);
	}
	

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	@Override
	public void onHitByBullet() {
		robot.turnLeft(90);
		robot.ahead(100);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	@Override
	public void onHitWall() {
		robot.turnLeft(90);
		robot.ahead(100);
	}	

}
