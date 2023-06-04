package chapter7.array;

public class ObjectCopy {
    public static void main(String[] args) {
        Book[] bookArray1 = new Book[5];
        Book[] bookArray2 = new Book[5];

        bookArray1[0] = new Book("tmp1", "hi");
        bookArray1[1] = new Book("tmp2", "hi");
        bookArray1[2] = new Book("tmp3", "hi");
        bookArray1[3] = new Book("tmp4", "hi");
        bookArray1[4] = new Book("tmp5", "hi");

        /*
        * 배열 얕은 복사 (System.arraycopy(src, srcPos, dist, distPos, length)) -> 주소만 복사
        * - src: 복사할 배열 이름
        * - srcPos: 복사할 배열 첫번째 위치
        * - dist: 붙여넣을 대상 배열 이름
        * - distPos: 붙여 넣기를 시작할 위치
        * - length: 복사할 요소의 개수
        * */
        System.arraycopy(bookArray1, 0, bookArray2, 0, bookArray1.length);

        for (int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].showBookInfo();
        }

        // 배열 깊은 복사
        Book[] bookArray3 = new Book[5];
        bookArray3[0] = new Book();
        bookArray3[1] = new Book();
        bookArray3[2] = new Book();
        bookArray3[3] = new Book();
        bookArray3[4] = new Book();

        for (int i = 0; i < bookArray3.length; i++) {
            bookArray3[i].setBookName(bookArray1[i].getBookName());
            bookArray3[i].setAuthor(bookArray1[i].getAuthor());
        }

        for (int i = 0; i < bookArray3.length; i++) {
            bookArray3[i].showBookInfo();
        }

        bookArray1[0].setBookName("newBook");
        bookArray1[0].setAuthor("newAuthor");

        System.out.println("============");
        for (int i = 0; i < bookArray1.length; i++) {
            bookArray1[i].showBookInfo();
        }
        System.out.println("============");
        for (int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].showBookInfo();
        }
        System.out.println("============");
        for (int i = 0; i < bookArray3.length; i++) {
            bookArray3[i].showBookInfo();
        }

        // 향상된 for 문 (enhanced for loop)
        String[] strArr = {"1", "2", "3"};
        for (String s : strArr) {
            System.out.println(s);
        }

        int[] intArr = {1, 2, 3};
        for (int i : intArr) {
            System.out.println(i);
        }
    }
}
