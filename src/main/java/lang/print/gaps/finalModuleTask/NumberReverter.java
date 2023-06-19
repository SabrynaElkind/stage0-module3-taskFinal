package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {

        int myInt = Integer.parseInt(new StringBuilder(String.valueOf(number)).reverse().toString());
        System.out.println(myInt);
    }
}
