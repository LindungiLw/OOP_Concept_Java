package primitive_references_data_types.null_condition;

public class Null3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count=" + bigData.count);
        System.out.println("bigData.data=" + bigData.data);

        System.out.println("bigData.data.value=" + bigData.data.value);
    }
}
