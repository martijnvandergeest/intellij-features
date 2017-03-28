package debugging;

//SHIFT-F10: Run
//ALT-SHIFT-F10: Run configuration
//CTRL-SHIFT-F10: Smart run?
//SHIFT-F9: Debug
//ALT-SHIFT-F9: Debug configuration
public class Debugging {
    public void run() {
        System.out.println("Running");

        InnerDebugging innerDebugging = new InnerDebugging();
        innerDebugging.runInner();
    }

    public void runAnonymous() {
        System.out.println("Running anonymous");

        constructAnonymous().runInner(); //SHIFT-F7: Smart step into
    }

    //SHIFT-F8: Step out
    private InnerDebugging constructAnonymous() {
        InnerDebugging innerDebugging = new InnerDebugging(){
            @Override
            public void runInner() {
                System.out.println("Running inner as Anonymous");
            }
        };
        return innerDebugging;
    }

    //F7: Step into
    //F8: Step over
    //F9: Resume program
    //CTRL-SHIFT-F8: View breakpoints
    public static void main(String[] args) {
        Debugging debugging = new Debugging(); //CTRL-F8: Toggle breakpoint
        debugging.run();
        debugging.runAnonymous();
    }

    private class InnerDebugging {
        public void runInner() {
            System.out.println("Running inner");
        }
    }
}
