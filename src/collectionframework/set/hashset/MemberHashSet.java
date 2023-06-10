package collectionframework.set.hashset;

import collectionframework.Member;

import java.util.HashSet;

public class MemberHashSet {
    private HashSet<Member> hashSet;

    public MemberHashSet() {
        this.hashSet = new HashSet<>();
    }

    public void addMember(Member member) {
        hashSet.add(member);
    }

    public boolean removeMember(int memberId) {
        for (Member m : hashSet) {
            if (m.getMemberId() == memberId) {
                hashSet.remove(m);
                System.out.println("Success");
                return true;
            }
        }

        System.out.println("Failure");
        return false;
    }

    public void showAll() {
        for (Member m : hashSet) {
            System.out.println(m);
        }
        System.out.println(hashSet);
    }
}
