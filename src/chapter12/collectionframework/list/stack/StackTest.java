package chapter12.collectionframework.list.stack;

public class StackTest {
    public static void main(String[] args) {
        ArrayListStack arrayListStack = new ArrayListStack();

        arrayListStack.push("a");
        arrayListStack.push("b");
        arrayListStack.push("c");

        System.out.println(arrayListStack.pop());
        System.out.println(arrayListStack.pop());
        System.out.println(arrayListStack.pop());
        System.out.println(arrayListStack.pop());

    }
}
