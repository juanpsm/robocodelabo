package laboratorio;

import java.awt.Color;
import java.awt.Graphics2D;

import robocode.*;
//import java.awt.Color;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * Robot17 - a robot by (your name here)
 */
public class Robot17 extends Robot
{
	/**
	 * run: Robot17's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		// setColors(Color.red,Color.blue,Color.green); // body,gun,radar

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
		}
	}
	int scannedX = Integer.MIN_VALUE;
	int scannedY = Integer.MIN_VALUE;

	public void onPaint(Graphics2D g) {
	    // Set the paint color to a red half transparent color
	    g.setColor(new Color(0xff, 0x00, 0x00, 0x80));
	  
		// Draw a line from our robot to the scanned robot
	    g.drawLine(scannedX, scannedY, (int)getX(), (int)getY());
	  
	    // Draw a filled square on top of the scanned robot that covers it
	    g.fillRect(scannedX - 20, scannedY - 20, 40, 40);
	}
	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Calculate the angle to the scanned robot
	    double angle = Math.toRadians((getHeading() + e.getBearing()) % 360);

	    // Calculate the coordinates of the robot
	    scannedX = (int)(getX() + Math.sin(angle) * e.getDistance());
	    scannedY = (int)(getY() + Math.cos(angle) * e.getDistance());
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		back(10);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		back(20);
	}	
}
