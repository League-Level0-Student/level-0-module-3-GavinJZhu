package _99_extra;

import javax.swing.JOptionPane;

public class BirthdayReminder {

    public static void main(String[] args) {

        // 1. correct the birthdays for your family below
        String momsBirthday = "January 24th";
        String dadsBirthday = "June 9th";
        String myBirthday = "April 16th";

        // 2. Find out which birthday the user wants and and store their response in a variable
        String person = JOptionPane.showInputDialog(null, "Whos birthday do you want?");
        // 3. Print out what the user typed
        System.out.println(person);
        // 4. if user asked for "mom"
        //print mom's birthday
        if (person.equalsIgnoreCase("mom")) {
        	JOptionPane.showMessageDialog(null, momsBirthday);
        }
        // 5. if user asked for "dad"
        // print dad's birthday
        else if (person.equalsIgnoreCase("dad")) {
        	JOptionPane.showMessageDialog(null, dadsBirthday);
        }
        // 6. if user asked for your name
        // print myBirthday
        else if (person.equalsIgnoreCase("yours")) {
        	JOptionPane.showMessageDialog(null, myBirthday);
        }
        //7. otherwise print "Sorry, i don't remember that person's birthday!"
        else {
        	JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday!");
        }
    }
}
