package constructors.material;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        initMember(member1, "user1", 15, 90);
        MemberInit member2 = new MemberInit();
        initMember(member2, "user2", 16, 80);
        MemberInit[] members = {member1, member2};
        for (MemberInit s : members) {
            System.out.println("Name: " + s.name + " Age: " + s.age + " Grade:" + s.grade);
        }
    }
    static void initMember(MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
