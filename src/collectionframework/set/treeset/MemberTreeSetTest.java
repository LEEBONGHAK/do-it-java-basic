package collectionframework.set.treeset;

import collectionframework.Member;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member m1 = new Member(101, "Lee");
        Member m2 = new Member(102, "Kim");
        Member m3 = new Member(103, "Park");

        memberTreeSet.addMember(m1);
        memberTreeSet.showAll();
        memberTreeSet.addMember(m2);
        memberTreeSet.showAll();
        memberTreeSet.addMember(m3);
        memberTreeSet.showAll();

        Member m4 = new Member(101, "AAA");
        memberTreeSet.addMember(m4);
        memberTreeSet.showAll();

        System.out.println("---------------");

        memberTreeSet.removeMember(100);
        memberTreeSet.showAll();
        memberTreeSet.removeMember(101);
        memberTreeSet.showAll();
        memberTreeSet.removeMember(102);
        memberTreeSet.showAll();
        memberTreeSet.removeMember(103);
        memberTreeSet.showAll();
    }
}
