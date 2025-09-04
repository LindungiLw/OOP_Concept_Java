package access_modifier.classlevel;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        data.publicField = 1;
        data.publicMethod();

        data.defaultField = 2;
        data.defaultMethod();
// private call not possible
//data.privateField = 3;
//data.privateMethod();
        data.innerAccess();
    }
}
