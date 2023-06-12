import java.util.*;

public class collection {
    public static void main(String[] args) {
       ArrayList<String> c=new ArrayList<>();
        c.add("que");
        c.add("fsfs");
        c.remove("que");
        System.out.println(c.contains("fsfs"));
        c.forEach((elemnt) ->{
            System.out.println(elemnt);
        });


        }

    }
    

