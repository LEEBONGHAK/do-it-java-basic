package chapter12.collectionframework.list.queue;

import java.util.ArrayList;

public class ArrayListQueue {
    private ArrayList<String> arrayListQueue = new ArrayList<>();

    public void enQueue(String data) {
        arrayListQueue.add(data);
    }

    public String deQueue() {
        if (arrayListQueue.size() == 0) {
            System.out.println("Empty");
            return null;
        }

        return arrayListQueue.remove(0);
    }
}
