package chapter12.collectionframework;

import java.util.Comparator;

// Comparable, Comparator 둘 중 하나만 구현해도 괜츈
public class Member implements Comparable<Member>, Comparator<Member> {

    private int memberId;
    private String memberName;

    public Member() {}

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return memberName + ", " + memberId;
    }

    @Override
    public int hashCode() {
        return this.memberId;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member m = (Member) obj;

            if (this.memberId == m.memberId) return true;
            else return false;
        }

        return false;
    }

    // 양수 시 오름차순
    // 음수 시 내림차순
    // for Comparable Interface
    @Override
    public int compareTo(Member member) {
        return this.memberName.compareTo(member.memberName);
    }

    // for Comparator Interface
    // 1번 파라미터 나 자신, 2번 파라미터 들어온 값
    @Override
    public int compare(Member m1, Member m2) {
        return m1.memberId - m2.memberId;
    }
}
