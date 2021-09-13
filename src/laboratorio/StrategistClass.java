package laboratorio;

import robocode.JuniorRobot;

public abstract class StrategistClass{
	public static Strategist strategist1 = new Strategist1();
	public static Strategist strategist2 = new Strategist2();
		
	private static class Strategist1 implements Strategist{
		public Strategy calculateStrategy(JuniorRobot robot) {
			if (robot.energy < 30 || robot.others > 5){
				// el enunciado dice que "devuelve la estrategia"
				// si no se podría hacer robot.setStrategy..
				robot.out.println("Changed STRATEGY to: Defensive");
				return new Defensive(robot);
			}
			else {
				robot.out.println("Changed STRATEGY to: Agressive");
				return new Agressive(robot);
			}
		}
		
	}
	
	private static class Strategist2 implements Strategist{
		public Strategy calculateStrategy(JuniorRobot robot) {
			if (robot.others > 2 && robot.energy > 15) {
				return new Agressive(robot);
			}
			else {
				return new Testing(robot);
			}
		}
		
	}    
}
