package laboratorio;

import robocode.JuniorRobot;

public class Testing extends StrategyClass {
	
	public Testing(Labo17Robot labo17Robot) {
		super(labo17Robot);
	}

	@Override
	public void run() {
		    robot.setColors(JuniorRobot.blue, JuniorRobot.blue, JuniorRobot.blue, JuniorRobot.blue, JuniorRobot.blue);
			robot.turnGunRight((int) Double.POSITIVE_INFINITY);
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	@Override
	public void onScannedRobot() {
//		robot.out.println("Strat:");
//		robot.out.println("scannedAngle:    " + robot.scannedAngle);
//		robot.out.println("scannedBearing:  " + robot.scannedBearing);
//		robot.out.println("scannedDistance: " + robot.scannedDistance);
//		robot.out.println("scannedHeading:  " + robot.scannedHeading);
//		robot.out.println("scannedVelocity: " + robot.scannedVelocity);
//		robot.out.println("scannedEnergy:   " + robot.scannedEnergy);
//		robot.out.println();
//		robot.out.println("myHeading:    " + robot.heading);
//		robot.out.println("myGunHeading: " + robot.gunHeading);
//		robot.out.println("myGunBearing: " + robot.gunBearing);
//		robot.out.println("myX:          " + robot.robotX);
//		robot.out.println("myY:          " + robot.robotY);
		robot.out.println("others:          " + robot.others);
		robot.out.println();
		robot.out.println();
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	@Override
	public void onHitByBullet() {
		robot.back(10);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	@Override
	public void onHitWall() {
		robot.back(20);
	}

	@Override
	public void onHitRobot() {
		robot.back(20);		
	}	
}
