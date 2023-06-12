import java.util.HashMap;
import java.util.*;

public class romantodig{
    public static void main(String[] args) {
     
roman("MXL");
    }
    public static void roman(String s) {
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',1000);
       int result=map.get(s.charAt(s.length()-1));
       for(int i=s.length()-2;i>=0;i--){
           if(map.get(s.charAt(i)) >= map.get(s.charAt(i+1))){
               result-=map.get(s.charAt(i));
           }
       else{ result+=map.get(s.charAt(i));}
      
        }
        return result;
    
    }

}


