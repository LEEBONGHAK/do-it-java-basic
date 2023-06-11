package chapter13.lambdaexpression;

public class TestStringConcat {
    public static void main(String[] args) {
        StringConcatImp1 stringConcatImp1 = new StringConcatImp1();
        stringConcatImp1.makeString("hello", "java");

        StringConcat stringConcat = (s1, s2) -> System.out.println(s1 + " " + s2);
        stringConcat.makeString("hello", "java");

        StringConcat stringConcat1 = new StringConcat() {
            @Override
            public void makeString(String s1, String s2) {
                System.out.println(s1 + " " + s2);
            }
        };
        stringConcat1.makeString("hello", "java");
    }
}

