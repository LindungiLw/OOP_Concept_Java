package constructors.material;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16);
        MemberConstruct[] members = {member1, member2};
        for (MemberConstruct s : members) {
            System.out.println("Name:" + s.name + " Age:" + s.age + " Grade:" + s.grade);
        }
    }
}
