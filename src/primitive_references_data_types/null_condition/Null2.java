package primitive_references_data_types.null_condition;

import primitive_references_data_types.assigning_variables.Data;

public class Null2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10;
        System.out.println("data = " + data.value);
    }
}
