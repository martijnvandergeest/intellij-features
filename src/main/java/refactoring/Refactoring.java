package refactoring;

//F5: Copy (only file-system level)
//ALT-DELETE: Safe delete
//SHIFT-F6: Rename
public class Refactoring {
    RefactoringSub refactoringSub = new RefactoringSub();

    int tableOf = 9;

    //F6: Move
    public void moveMe(String s) {
        refactoringSub.doSomething();
    }

    //CTRL-F6: Change signature
    public String changeMySignature(String s) {
        return s + "a";
    }

    //CTRL-ALT-M: Extract Method
    public void extractMethod() {
        int tableOf = this.tableOf;

        for (int i = 0; i < 10; i++) {
            System.out.println(i * tableOf);
        }

        extractVariable();
    }

    //CTRL-ALT-V: Extract Variable
    //CTRL-ALT-F: Extract Field
    //CTRL-ALT-C: Extract Constant
    //CTRL-ALT-P: Extract Parameter
    public void extractVariable() {
        if (new String("bla").equals(new String("blu"))) {
            System.out.println("Please do something");
        }
    }

    public void mustBeCalled() {
        extractVariable();
    }
}
