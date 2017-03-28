package editing;

//CTRL-ALT-T
public class SurroundWith {
    public void ifElse() {
        System.out.println("CTRL-ALT-T me");
    }

    public void exceptions() {
//        throw new Exception();
    }

    public void liveTemplate() {
        new Thread(new Runnable() {
            public void run() {
                System.out.println("run me");
            }
        }).start();
    }
}
