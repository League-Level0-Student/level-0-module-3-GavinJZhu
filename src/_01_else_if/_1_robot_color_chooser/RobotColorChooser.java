
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;
import java.awt.*;
import org.jointheleague.graphical.robot.Robot;


public class RobotColorChooser {
	public static void main(String[] args) {


		//1. Create a new Robot
		Robot rob = new Robot();
		rob.penDown();
	    //2. Make the robot draw a shape (this will take more than one line of code)
		rob.move(160);
		rob.setAngle(90);
		rob.move(160);
		rob.setAngle(180);
		rob.move(160);
		rob.setAngle(270);
		rob.move(160);
		//3. Set the pen width to 10
		rob.setPenWidth(10);
		//4. Ask the user what color pen they would like the robot to draw with

		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
