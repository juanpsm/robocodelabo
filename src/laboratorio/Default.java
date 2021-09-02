package laboratorio;

public class Default implements Strategy {

	Labo17Robot robot;
	
	public Default(Labo17Robot labo17Robot) {
		robot = labo17Robot;
	}

	@Override
	public void run() {
		robot.ahead(100);
		robot.turnGunRight(360);
		robot.back(100);
		robot.turnGunRight(360);
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	@Override
	public void onScannedRobot() {
		robot.fire(1);
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
}
