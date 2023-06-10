package collectionframework.map.hashmap;

import collectionframework.Member;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
    private HashMap<Integer, Member> hashMap;

    public MemberHashMap() {
        this.hashMap = new HashMap<>();
    }

    public void addMember(Member memeber) {
        hashMap.put(memeber.getMemberId(), memeber);
    }

    public boolean removeMember(int memberId) {
        if (hashMap.containsKey(memberId)) {
            hashMap.remove(memberId);
            System.out.println("Success");
            return true;
        }

        System.out.println("Failure");
        return false;
    }

    public void showAllMember() {
        Iterator<Integer> ir = hashMap.keySet().iterator();
        while (ir.hasNext()) {
            int key = ir.next();
            Member member = hashMap.get(key);

            System.out.println(member);
        }
    }
}
