package chapter12.collectionframework.list.arraylist;

import chapter12.collectionframework.Member;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
    private ArrayList<Member> arrayList;

    public MemberArrayList() {
        arrayList = new ArrayList<Member>();
    }

    public void addMember(Member member) {
        arrayList.add(member);
    }

    public boolean removeMember(int memberId) {
//        for ( Member m : arrayList) {
//            if (m.getMemberId() == memberId) {
//                arrayList.remove(m);
//                System.out.println("삭제 성공");
//                return true;
//            }
//        }

        Iterator<Member> it = arrayList.iterator();
        while (it.hasNext()) {
            Member m = it.next();
            if (m.getMemberId() == memberId) {
                arrayList.remove(m);
                System.out.println("삭제 성공");
                return true;
            }
        }

        System.out.println("존재하지 않음");
        return false;
    }

    public void showAll() {
        for (Member m : arrayList) {
            System.out.println(m);
        }

        System.out.println(arrayList);
    }
}
