public class Stack{

    int s[]=new int [10];
    int t;
    Stack(){
        t=-1;
    }
    void push(int i){
        s[++t]=i;
    }
    int pop(){
        return s[t--];
    }

//public class stackde{
    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.push(5);
        s1.push(7);
        s1.push(2);
        System.out.println(s1.pop());
        
    }
}