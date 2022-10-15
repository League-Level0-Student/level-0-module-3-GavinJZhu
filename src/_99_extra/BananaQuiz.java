package _99_extra;

import javax.swing.*;

public class BananaQuiz {

    public static void main(String[] args) {
        //1. ask the user if they like bananas
        String bananas = JOptionPane.showInputDialog("Do you like bananas?");
        //2. if they say no,
        //tell them they are crazy
        //and end quiz
        if (bananas.equalsIgnoreCase("no")) {
            JOptionPane.showMessageDialog(null, "You're crazy.");
        } else if (bananas.equalsIgnoreCase("yes")) {
            String hobby = JOptionPane.showInputDialog(null, "Whats you're favorite hobby?");
            JOptionPane.showMessageDialog(null, hobby + " is much better with bananas!");
        } else {
            JOptionPane.showMessageDialog(null, "You are bananas!");
        }
        //3. if they say yes
        //	ask them what is their favorite hobby
        //	show a pop up that says "<your hobby> is much better with bananas!
    }


    //4. OPTIONAL: if they say something other than "yes?" or "no?"
    //	show a pop up that says "You are bananas!?"

}


