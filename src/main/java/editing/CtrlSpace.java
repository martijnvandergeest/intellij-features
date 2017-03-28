package editing;

public class CtrlSpace {
    private int someInt = 0;
    private String someString = "";
    private InnerCtrlSpace innerClass = new InnerCtrlSpace();

    //CTRL-SPACE / CTRL-SHIFT-SPACE / 2x CTRL-SHIFT-SPACE
    public void ctrlSpace() {
        String s = innerClass.getAnotherInnerString();
    }

    private String getAnotherString() {
        return "";
    }

    private class InnerCtrlSpace {
        public String innerString = "";

        public String getAnotherInnerString() {
            return "";
        }
    }
}
