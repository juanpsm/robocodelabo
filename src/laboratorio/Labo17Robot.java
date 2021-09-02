package laboratorio;
import robocode.*;


public class Labo17Robot extends JuniorRobot
{
	Strategy strategy;
	
	public Labo17Robot() {
		strategy =  new Default(this);
	}

	public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
	}
    
	public Strategy getStrategy() {
        return this.strategy;
	}
    
	@Override	
	public void run() {
		setColors(orange, blue, white, yellow, black);
		strategy.run();
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	@Override
	public void onScannedRobot() {
		strategy.onScannedRobot();
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	@Override
	public void onHitByBullet() {
		strategy.onHitByBullet();
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	@Override
	public void onHitWall() {
		strategy.onHitWall();
	}	
}