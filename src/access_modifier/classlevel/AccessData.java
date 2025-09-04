package access_modifier.classlevel;

public class AccessData {
    public int publicField;
    int defaultField;
    private int privateField;
    public void publicMethod() {
        System.out.println("Call publicMethod" + publicField);
    }
    void defaultMethod() {
        System.out.println("Call defaultMethod" + defaultField);
    }
    private void privateMethod() {
        System.out.println("Call privateMethod " + privateField);
    }
    public void innerAccess() {
        System.out.println("Call inside");
        publicField = 100;
        defaultField = 200;
        privateField = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
