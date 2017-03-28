package navigation;

import javax.swing.*;
import java.awt.event.ActionEvent;


/* COOL/IMPORTANT

    //CTRL-SHIFT-I: quick definition lookup
    //CTRL-F12: file structure popup
    //ALT-HOME: Show navigation bar --> Hide to get a popup navigation bar
    //SHIFT-F11: Show bookmarks
*/

//CTRL-B: go to declaration
//CTRL-ALT-B: go to implementation(s)
//CTRL-U: go to superclass
//F4: View/Edit source
public class Navigation extends AbstractAction implements Runnable {

    //ALT-UP / ALT-DOWN: go to previous/next method
    public void methodA() {

    }

    //CTRL-[ / CTRL-]: go to codeblock start/end
    public void methodB() {

    }

    //F2 / SHIFT-F2: go to next/previous error
    public void methodC() {
        String someString = "pointlessOverwrittenString";
        someString = "thisWillBeUsed";
        String unusedString = someString;
    }

    //CTRL-U: go to super-method
    public void actionPerformed(ActionEvent e) {

    }

    //F11: bookmark
    //CTRL-F11: bookmark with mnemonic
    public void run() {
        System.out.println("This code will, unfortunately, never run");
    }
}
