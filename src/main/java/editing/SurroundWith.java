package editing;

//CTRL-ALT-T: Surround with
public class SurroundWith {
    public void ifElse() {
        System.out.println("CTRL-ALT-T me");
    }

    public void exceptions() {
//todo uncomment        throw new Exception();
    }

    //CTRL-ALT-J: Insert live template --> works too
    public void liveTemplate() {
        new Thread(new Runnable() {
            public void run() {
                System.out.println("run me");
            }
        }).start();
    }

    //CTRL-J below to make a main
}
