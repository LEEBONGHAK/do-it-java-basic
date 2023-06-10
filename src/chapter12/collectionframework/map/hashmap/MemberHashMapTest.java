package chapter12.collectionframework.map.hashmap;


import chapter12.collectionframework.Member;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();

        Member m1 = new Member(102, "이순신");
        Member m2 = new Member(101, "김유신");
        Member m3 = new Member(103, "신사임당");

        memberHashMap.addMember(m1);
        memberHashMap.addMember(m2);
        memberHashMap.addMember(m3);

        memberHashMap.showAllMember();

        memberHashMap.removeMember(102);
        memberHashMap.showAllMember();
    }
}
