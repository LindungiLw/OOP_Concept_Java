package final_;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myId", "kim");
        member.print();
        member.changeData("myId2","seo");
        member.print();
    }
}
