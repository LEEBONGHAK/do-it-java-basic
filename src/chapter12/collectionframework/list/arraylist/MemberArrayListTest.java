package chapter12.collectionframework.list.arraylist;

import chapter12.collectionframework.Member;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();
        Member m1 = new Member(101, "Lee");
        Member m2 = new Member(102, "Kim");
        Member m3 = new Member(103, "Park");

        memberArrayList.addMember(m1);
        memberArrayList.showAll();
        memberArrayList.addMember(m2);
        memberArrayList.showAll();
        memberArrayList.addMember(m3);
        memberArrayList.showAll();

        System.out.println("---------------");

        memberArrayList.removeMember(100);
        memberArrayList.showAll();
        memberArrayList.removeMember(101);
        memberArrayList.showAll();
        memberArrayList.removeMember(102);
        memberArrayList.showAll();
        memberArrayList.removeMember(103);
        memberArrayList.showAll();
    }
}
