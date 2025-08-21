package operators.example;

public class String_Operator {
    public static void main(String[] args) {
        String result1 = "Hello" + " " + "World";
        System.out.println(result1);

        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + " " + s2;
        System.out.println(result2);

        String result3 = "a + b" + 10;
        System.out.println(result3);

        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println(result4);
    }
}
