package laboratorio;
import robocode.*;


public class Labo17Robot extends JuniorRobot
{
	Strategy strategy;
	
	public Labo17Robot() {
//		setColors(red, black, yellow, red, white);
		strategy =  new Agressive(this);
	}

	public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
	}
    
	public Strategy getStrategy() {
        return this.strategy;
	}
    
	@Override
	public void run() {
		// setColors(red, black, yellow, red, yellow);
		strategy.run();
	}

	@Override
	public void onScannedRobot() {
		strategy.onScannedRobot();
	}

	@Override
	public void onHitByBullet() {
		strategy.onHitByBullet();
	}

	@Override
	public void onHitWall() {
		strategy.onHitWall();
	}
	
	@Override
	public void onHitRobot() {
		strategy.onHitWall();
	}	
}