package conditional_statements.if_else;

public class If_Else5 {
    public static void main(String[] args) {
       int price  = 100000;
       int age = 10;
       int discount = 0;

       if (price >= 100000){
           discount = discount + 10000;
           System.out.println("Purchase over 100000 rupiah, 100000 rupiah discount");
       }
       if (age <= 10){
           discount = discount + 10000;
           System.out.println("Children 10000 rupiah discount");
       }
        System.out.println("Total discount amount: " + discount + "rupiah");
    }
}
