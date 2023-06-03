package chapter7.src.arraylist;

import java.util.ArrayList;

public class ArrayListTest {
    /**
     * ArrayList 클래스
     * - Java에서 기본으로 제공하는 객체 배열이 구현된 클래스이며, 가장 많이 사용되는 객체 배열 클래스
     *
     * ArrayList 주요 메서드
     * - boolean add(E e) : 배열에 요소 추가
     * - int size() : 배열에 추가된 전체 개수를 반환
     * - E get(int index) : index 위치에 해당하는 요소를 반환
     * - E remove(int index): index 위치에 해당하는 요소를 제거하고 그 값을 반환
     * - boolean isEmpty() : 배열이 비어있는지 확인
     * 이외에도 여러가지 메서드가 존재
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
