package chapter12.collectionframework.map.treemap;

import chapter12.collectionframework.Member;

import java.util.Iterator;
import java.util.TreeMap;

public class MemberTreeMap {
    private TreeMap<Integer, Member> treeMap;

    public MemberTreeMap() {
        this.treeMap = new TreeMap<>();
    }

    public void addMember(Member memeber) {
        treeMap.put(memeber.getMemberId(), memeber);
    }

    public boolean removeMember(int memberId) {
        if (treeMap.containsKey(memberId)) {
            treeMap.remove(memberId);
            System.out.println("Success");
            return true;
        }

        System.out.println("Failure");
        return false;
    }

    public void showAllMember() {
        Iterator<Integer> ir = treeMap.keySet().iterator();
        while (ir.hasNext()) {
            int key = ir.next();
            Member member = treeMap.get(key);

            System.out.println(member);
        }
    }
}
