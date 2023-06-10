package collectionframework.map.treemap;

import collectionframework.Member;

public class MemberTreeMapTest {
    public static void main(String[] args) {
        MemberTreeMap memberTreeMap = new MemberTreeMap();

        Member m1 = new Member(102, "이순신");
        Member m2 = new Member(101, "김유신");
        Member m3 = new Member(103, "신사임당");

        memberTreeMap.addMember(m1);
        memberTreeMap.addMember(m2);
        memberTreeMap.addMember(m3);

        memberTreeMap.showAllMember();

        memberTreeMap.removeMember(102);
        memberTreeMap.showAllMember();
    }
}
