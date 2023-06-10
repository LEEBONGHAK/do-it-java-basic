package chapter12.collectionframework.list.stack;

import java.util.ArrayList;

public class ArrayListStack {
    private ArrayList<String> arrayListStack = new ArrayList<>();

    public void push(String data) {
        arrayListStack.add(data);
    }

    public String pop() {
        if (arrayListStack.size() == 0) {
            System.out.println("Empty");
            return null;
        }

        return arrayListStack.remove(arrayListStack.size() - 1);
    }

    public String peak() {
        if (arrayListStack.size() == 0) {
            System.out.println("Empty");
            return null;
        }

        return arrayListStack.get(0);
    }
}
