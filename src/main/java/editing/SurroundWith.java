package editing;

//CTRL-ALT-T: Surround with
public class SurroundWith {
    public void ifElse() {
        System.out.println("CTRL-ALT-T me");
    }

    public void exceptions() {
//todo uncomment        throw new Exception();
    }

    //CTRL-ALT-J: Surround with live template --> works too
    public void liveTemplate() {
        new Thread(new Runnable() {
            public void run() {
                System.out.println("run me");
            }
        }).start();
    }

    //CTRL-J: Insert live template --> Do this below to make a main
}
