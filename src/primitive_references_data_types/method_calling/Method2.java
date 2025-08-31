package primitive_references_data_types.method_calling;

import primitive_references_data_types.assigning_variables.Data;

public class Method2 {
    public static void main(String[] args) {
        Data data = new Data();
        data.value = 10;
        System.out.println("Before Calling a method: data.value = " + data.value);
        changeReference(data);
        System.out.println("After Calling Method: " + data.value);
    }

    static void changeReference(Data x){
        x.value = 20;
    }
}
