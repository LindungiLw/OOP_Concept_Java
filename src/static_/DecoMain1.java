package static_;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "hello java";
        DecoUtil1 utils = new DecoUtil1();
        String deco = utils.deco(s);
        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
