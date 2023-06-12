public class repeatedchar{
    public static void main(String[] args) {
        String s="hlo world";
        char f=' ';
        int c=0;
        char[] d=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(d[i]==f){c++;
                continue;}
            System.out.print(d[i]);//remove whitespace
            

        }
        System.out.println();
        for(int i=0;i<s.length();i++){
           for(int j=i+1;j<s.length();j++){
            if(d[i]==d[j]){c++;
                System.out.println(d[j]+" "+c);}
            //remove whitespace
        }
        
        
    }
    
}}