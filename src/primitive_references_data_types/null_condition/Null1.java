package primitive_references_data_types.null_condition;

import primitive_references_data_types.assigning_variables.Data;

public class Null1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data);
        data = new Data();
        System.out.println("2. data = " + data);
        data = null;
        System.out.println("3. data = " + data);
    }
}
