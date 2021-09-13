package laboratorio;

import robocode.*;


public class Labo17Robot extends JuniorRobot
{
	Strategy strategy;
	Strategist strategist;
	
	class Estratega1 extends StrategistClass{
		public Estratega1(Labo17Robot labo17Robot) {
			super(labo17Robot);
		}
	    public void calculateStrategy() {
	    	if (robot.others > 2) {
	    		robot.setStrategy(new Testing(this.robot));
	    		robot.out.println("Changed STRATEGY to: Testing");
	    	} else {
	    		robot.setStrategy(new Agressive(this.robot));
	    		robot.out.println("Changed STRATEGY to: Agressive");
	    	}
	    }
	}
	
	class Estratega2 extends StrategistClass{
	    public void calculateStrategy() {
	    	if (robot.others > 5) {
	    		robot.setStrategy(new Agressive(this.robot));
	    	}
	    }
	}
	
	public Labo17Robot() {
//		setColors(red, black, yellow, red, white);
		strategist = new Estratega1(this);
//		strategy =  new Testing(this);
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
		strategist.calculateStrategy();
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