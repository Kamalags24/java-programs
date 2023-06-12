class BankAccount<T> {
    T t1;
    BankAccount(T t1){
        this.t1=t1;
    } 
    public void display() {
        System.out.println(t1);
        
    }
    public <T> void depositemoney(T[] money){ 
        for(T i:money){
            System.out.print(i+" ");
        }
System.out.println();
        
    }
}
public class GenericClass {
    public static void main(String[] args) {
        BankAccount<String> b1=new BankAccount<>("abc");
        b1.display();
        Integer[] m1={1000,2000,3000};
        double[] m2={10.2,20.1,30.1};
        b1.depositemoney(m1);
    }
    
}
