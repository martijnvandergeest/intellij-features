package navigation;

import javax.swing.*;
import java.awt.event.ActionEvent;


/* COOL/IMPORTANT

    //CTRL-SHIFT-I: Quick definition lookup
    //CTRL-F12: File structure popup
    //ALT-HOME: Show navigation bar --> Hide to get a popup navigation bar
    //SHIFT-F11: Show bookmarks
*/

//CTRL-B: Go to declaration
//CTRL-ALT-B: go to implementation(s)
//CTRL-U: Go to superclass
//F4: View/Edit source
public class Navigation extends AbstractAction implements Runnable {

    //ALT-UP / ALT-DOWN: Go to previous/next method
    public void methodA() {

    }

    //CTRL-[ / CTRL-]: Go to codeblock start/end
    public void methodB() {

    }

    //F2 / SHIFT-F2: Go to next/previous error
    public void methodC() {
        String someString = "pointlessOverwrittenString";
        someString = "thisWillBeUsed";
        String unusedString = someString;
    }

    //CTRL-U: Go to super-method
    public void actionPerformed(ActionEvent e) {

    }

    //F11: Bookmark
    //CTRL-F11: Bookmark with mnemonic
    public void run() {
        System.out.println("This code will, unfortunately, never run");
    }
}
