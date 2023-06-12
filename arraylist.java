import java.util.*;

import javax.xml.transform.Source;
public class arraylist {
  public static void main(String[] args) {
         List<Integer> l1=new ArrayList<>();
         l1.add(1);        l1.add(61);
         l1.add(21);
        l1.add(13);
         l1.add(14);
         l1.add(15);
        l1.add(1);
        System.out.println(l1);

         List<Integer> l2=new ArrayList<>(l1);
         List<Integer> l3=new ArrayList<>();
         l3.add(12);
         l3.add(12);
         l3.add(12);
         l3.add(12);
         l3.add(12);
        l3.add(12);
 l2.addAll(l3);
 System.out.println(l2);
//access from array list;
List<String> l=new ArrayList<>();
System.out.println(l.isEmpty());
l.add("java");
l.add("c++");
l.add("python");
System.out.println(l.size());
System.out.println(l.get(1));
l.set(1, "c");
System.out.println(l);
l.remove(1);

System.out.println(l);
// l.removeAll(l);
System.out.println(l);

//basic for loop
for(int i=0;i<l.size();i++){
    System.out.print(l.get(i)+" ");
}


System.out.println();
//for enhanced loop
for(String i: l){
System.out.print(i);
}
System.out.println();
//basic loop with iterator

for(Iterator<String> it=l.iterator();it.hasNext();){
  
    System.out.println( it.next());
}


}
}
