package chapter7.array;

public class BookArray {
    public static void main(String[] args) {
        // 객체의 배열의 경우 객체의 메모리가 확보되는 것이 아닌 객체의 주소가 들어갈 수 있는 공간을 확보한 것
        Book[] library = new Book[5];

        for (int i = 0; i < library.length; i++) {
            System.out.println(library[i]);
        }

        library[0] = new Book("tmp", "hi");
        library[1] = new Book("tmp", "hi");
        library[2] = new Book("tmp", "hi");
        library[3] = new Book("tmp", "hi");
        library[4] = new Book("tmp", "hi");

        for (int i = 0; i < library.length; i++) {
            System.out.println(library[i]);
            library[i].showBookInfo();
        }
    }
}
