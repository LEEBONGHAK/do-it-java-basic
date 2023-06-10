package chapter12.collectionframework.list.queue;

public class QueueTest {
    public static void main(String[] args) {
        ArrayListQueue arrayListQueue = new ArrayListQueue();

        arrayListQueue.enQueue("a");
        arrayListQueue.enQueue("b");
        arrayListQueue.enQueue("c");

        System.out.println(arrayListQueue.deQueue());
        System.out.println(arrayListQueue.deQueue());
        System.out.println(arrayListQueue.deQueue());
        System.out.println(arrayListQueue.deQueue());
    }
}
