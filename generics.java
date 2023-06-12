import java.util.ArrayList;


import java.util.*;
public class generics {
    public static void main(String[] args) {
       
        //uses:-
        //provides type safety
       
        String ms[]= new String[2];
        ms[0]="222";
        //ms[1]=2;//Arrays are  type safe


        ArrayList a1=new ArrayList();
        a1.add("kin");
        a1.add(122);
        System.out.println(a1.get(0));//collections are not type safety

        //resolve type caste
        String s[] =new String[2];
        s[0]="abc";
        s[1]="pqr";
        String v=s[0];
        System.out.println(v);//arrays donot require type casting 

       ArrayList a2=new ArrayList();
       a2.add("prewa");
       String s4=(String)a2.get(0);
       System.out.println(s4);//collection need type casting .

 //use of generics:
       ArrayList<String> a3=new ArrayList<>();
       a3.add("lpa");
       //a3.add(45);//error bcoz its generic in integer
       String Value=a3.get(0);
       System.out.println(Value);


       

    }
    
}
