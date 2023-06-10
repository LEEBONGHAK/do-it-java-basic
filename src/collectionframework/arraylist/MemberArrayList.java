package collectionframework.arraylist;

import collectionframework.Member;

import java.util.ArrayList;

public class MemberArrayList {
    private ArrayList<Member> arrayList;

    public MemberArrayList() {
        arrayList = new ArrayList<Member>();
    }

    public void addMember(Member member) {
        arrayList.add(member);
    }

    public boolean removeMember(int memberId) {
        for ( Member m : arrayList) {
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
