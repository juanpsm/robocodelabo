package laboratorio;

import robocode.*;


public class Labo17Robot extends JuniorRobot
{
	Strategist strategist = StrategistClass.strategist1;
	
	public Labo17Robot() {
//		setColors(red, black, yellow, red, white);
//		strategist = new Estratega1(this); // no va mas porque es una clase interna ahora
//		strategy =  new Testing(this); // no va mas porque ahora lo decide el estratega
	}
    
	@Override
	public void run() {
		// setColors(red, black, yellow, red, yellow);
		strategist.calculateStrategy(this).run();

	}

	@Override
	public void onScannedRobot() {
		strategist.calculateStrategy(this).onScannedRobot();
	}

	@Override
	public void onHitByBullet() {
		strategist.calculateStrategy(this).onHitByBullet();
	}

	@Override
	public void onHitWall() {
		strategist.calculateStrategy(this).onHitWall();
	}
	
	@Override
	public void onHitRobot() {
		strategist.calculateStrategy(this).onHitWall();
	}	
}