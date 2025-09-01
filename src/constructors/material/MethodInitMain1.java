package constructors.material;

public class MethodInitMain1 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.name = "Lindungi";
        member1.age = 20;
        member1.grade = 90;

        MemberInit member2 = new MemberInit();
        member2.name = "Helen";
        member2.age = 20;
        member2.grade = 95;

        MemberInit[] members = {member1, member2};

        for (MemberInit member : members) {
            System.out.println("Name:" + member.name + " Age:" + member.age + " Grade:" + member.grade);
        }
    }
}
