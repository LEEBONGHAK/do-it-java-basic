package chapter14;

public class AutoCloseTest {
    public static void main(String[] args) {
        try (AutoCloseObj autoCloseObj = new AutoCloseObj();) {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("exception");
        }

        AutoCloseObj autoCloseObj1 = new AutoCloseObj();
        try (autoCloseObj1) {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("exception");
        }
    }
}
