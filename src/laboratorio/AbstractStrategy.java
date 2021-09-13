package laboratorio;

import robocode.JuniorRobot;

public abstract class AbstractStrategy implements Strategy {
	
	JuniorRobot robot;
	
	public AbstractStrategy(JuniorRobot robot) {
		this.robot = robot;
	}
}
