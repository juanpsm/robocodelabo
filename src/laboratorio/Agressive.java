package laboratorio;

import robocode.JuniorRobot;
import robocode.util.Utils;
import java.awt.color.*;

public class Agressive extends StrategyClass {

	public Agressive(Labo17Robot labo17Robot) {
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

//		robot.turnTo(robot.scannedBearing);
//		robot.ahead(robot.scannedDistance);
//		robot.bearGunTo(robot.scannedBearing);
//      
//		Intento de calcular donde va a estar el objetivo
//		double power = 1;
//		double ang = robot.scannedAngle;
//		System.out.println(ang);
//		double d = robot.scannedDistance;
//		System.out.println(d);
//		double t = d/(20-3*power);
//		int x = (int) (robot.robotX + d * Math.cos(ang));
//		int y = (int) (robot.robotY + d * Math.sin(ang));
//		
//		double angleToTarget = Math.atan2(x, y);
//		System.out.println(angleToTarget);
//		double targetAngle = Utils.normalRelativeAngle(angleToTarget - robot.heading);
		robot.turnGunTo(robot.scannedAngle);
		robot.fire(1);
	}
	
	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	@Override
	public void onHitRobot() {
		robot.back(20);
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
