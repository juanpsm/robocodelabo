package laboratorio;

public interface Strategy {
	
	abstract void run();
	abstract void onScannedRobot();
	abstract void onHitByBullet();
	abstract void onHitWall();
	abstract void onHitRobot();
}
