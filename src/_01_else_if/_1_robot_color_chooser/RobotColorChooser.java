
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;
import java.awt.*;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;


public class RobotColorChooser {
	public static void main(String[] args) {


		//1. Create a new Robot
		Robot rob = new Robot();
		rob.penDown();
	    //2. Make the robot draw a shape (this will take more than one line of code)

		//3. Set the pen width to 10
		rob.setPenWidth(10);
		rob.setSpeed(5);
		//4. Ask the user what color pen they would like the robot to draw with
		for (int i=0; i<100; i++){
			//String penColor = JOptionPane.showInputDialog("What pen color would you like to draw with?");
			//5. Use an if/else statement to set the pen color that the user requested
			String penColor = "";
			if (penColor.equalsIgnoreCase("blue")) {
				rob.setPenColor(0, 0, 255);
			}
			else if (penColor.equalsIgnoreCase("red")){
				rob.setPenColor(255,0,0);
			}
			else if (penColor.equalsIgnoreCase("orange")){
				rob.setPenColor(255, 165, 0);
			}
			else if (penColor.equalsIgnoreCase("yellow")){
				rob.setPenColor(Color.YELLOW);
			}
			else if (penColor.equalsIgnoreCase("green")){
				rob.setPenColor(0,255,0);
			}
			else if (penColor.equalsIgnoreCase("purple")){
				rob.setPenColor(161, 52, 235);
			}
			//6. If the user doesn't enter anything, choose a random color
			else if (penColor.isEmpty()) {
				rob.setRandomPenColor();
			}
			//7. Put a loop around your code so that you keep asking the user for more colors & drawing them


			move(rob);
		}
	}
	static void move(Robot rob){
		Random idontcare = new Random();
		int angle = idontcare.nextInt(360);
		rob.setAngle(angle);
		rob.move(160);
		rob.setAngle(90+angle);
		rob.move(160);
		rob.setAngle(180+angle);
		rob.move(160);
		rob.setAngle(270+angle);
		rob.move(160);
	}
}
