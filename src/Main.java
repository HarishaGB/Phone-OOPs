//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LandLine l1 = new LandLine("123");
        LandLine l2 = new LandLine("456");

        l1.callNumber("456");
        l2.receiveCall("123");
        System.out.println(l2.answerCall());
        System.out.println("Harisha G B you did it");
    }
}