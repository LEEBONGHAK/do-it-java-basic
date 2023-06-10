package collectionframework.set.treeset;

import collectionframework.Member;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
    private TreeSet<Member> treeSet;

    public MemberTreeSet() {
        this.treeSet = new TreeSet<Member>();
        // Comparator Interface 의 compare() 메서드를 사용하기 위해서는 아래와 같이 생성자를 만들어야 함
//        this.treeSet = new TreeSet<>(new Member());
    }

    public void addMember(Member member) {
        treeSet.add(member);
    }

    public boolean removeMember(int memberId) {
        Iterator<Member> it = treeSet.iterator();
        while (it.hasNext()) {
            Member m = it.next();

            if (m.getMemberId() == memberId) {
                treeSet.remove(m);
                System.out.println("Success");
                return true;
            }
        }

        System.out.println("Failure");
        return false;
    }

    public void showAll() {
        for (Member m : treeSet) {
            System.out.println(m);
        }
        System.out.println(treeSet);
    }
}
