//import java.util.*;


class BankAccount<T extends Number >{
    public  void dis(T[] money){ 
        for(T i:money){
            System.out.print(i+" ");
        }
}}
public class typegenerics {

     public static void main(String[] args) {
        BankAccount<Number> i1=new BankAccount<>();

        Integer[] m1={10,20,30};
    Double[] m2={1.1,1.2,1.3};
       i1.dis(m1);      
        i1.dis(m2);

        
    }
}
