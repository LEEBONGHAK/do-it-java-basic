package chapter12.collectionframework.set.hashset;

import chapter12.collectionframework.Member;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

        Member m1 = new Member(101, "Lee");
        Member m2 = new Member(102, "Kim");
        Member m3 = new Member(103, "Park");

        memberHashSet.addMember(m1);
        memberHashSet.showAll();
        memberHashSet.addMember(m2);
        memberHashSet.showAll();
        memberHashSet.addMember(m3);
        memberHashSet.showAll();

        Member m4 = new Member(101, "AAA");
        memberHashSet.addMember(m4);
        memberHashSet.showAll();

        System.out.println("---------------");

        memberHashSet.removeMember(100);
        memberHashSet.showAll();
        memberHashSet.removeMember(101);
        memberHashSet.showAll();
        memberHashSet.removeMember(102);
        memberHashSet.showAll();
        memberHashSet.removeMember(103);
        memberHashSet.showAll();
    }
}
