package chapter13.lambdaexpression;

public class StringConcatImp1 implements StringConcat {
    @Override
    public void makeString(String s1, String s2) {
        System.out.println(s1 + " " + s2);
    }
}
