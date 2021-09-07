package laboratorio;

public class Agressive extends StrategyClass {

	public Agressive(Labo17Robot labo17Robot) {
		super(labo17Robot);
	}

	@Override
	public void run() {
		    robot.setColors(robot.red, robot.black, robot.yellow, robot.red, robot.white);
		    
//		    while(true) {
//			robot.turnGunRight(360); // Spin gun around
//		    }
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	@Override
	public void onScannedRobot() {
//		robot.turnTo(robot.scannedBearing);
//		robot.ahead(robot.scannedDistance);
//		robot.bearGunTo(robot.scannedAngle);
		
		robot.turnGunTo(robot.scannedAngle);
		robot.turnTo(robot.scannedAngle);
		robot.ahead(100);
		robot.fire(1);
	}
	
	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	@Override
	public void onHitRobot() {
//		robot.turnLeft(90 - robot.hitByBulletBearing);
//		robot.back(100);
	}
	

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	@Override
	public void onHitByBullet() {
//		robot.turnLeft(90 - robot.hitByBulletBearing);
//		robot.back(100);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	@Override
	public void onHitWall() {
//		robot.turnRight(-robot.hitWallBearing); //This isn't accurate but release your robot.
//		robot.ahead(100);
	}	
}
