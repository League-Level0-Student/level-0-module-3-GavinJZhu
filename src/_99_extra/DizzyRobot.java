package _99_extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DizzyRobot {
    static Robot robot = new Robot();

    public static void main(String[] args) {
    	robot.setSpeed(30);
        // 1. Use the dance method below to make the robot spin.
    	String spin = JOptionPane.showInputDialog(null, "How dizzy do you want the robot? 1-10 spins");
        // 2. Ask the user how dizzy you want the robot from 1-10, then spin that number of times.
    	int spinInt = Integer.parseInt(spin);
    	dance(spinInt);
    }

    /*****************   Use this method, DON'T CHANGE THE CODE BELOW  **************/

    static void dance(int numberOfSpins) {
        for (int i = 0; i < numberOfSpins; i++) {
            robot.turn(360);
        }
    }
}

