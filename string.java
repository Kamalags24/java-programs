public class string {
   public static void main(String[] args) {
       String s="pakin";
       String s1=new String("hiii");
       String s2="hiii";
       String s3=new String("hiii");
       System.out.println(s.concat(s2));
       byte[] s6={65,66,67,68,69};
       String s4 =new String(s6,2,3);
       System.out.println(s4);
       System.out.println(s.length());//start from 1...
       //String operation
       System.out.println(2+2+"hi"+2+2);
       System.out.println(s.charAt(1));//stats from 0...
       System.out.println(s.equals(s2));
       System.out.println(s2.equals(s3));
       System.out.println(s2.compareTo(s1));
    StringBuilder a=new StringBuilder(s1);
    StringBuilder a1=new StringBuilder(s2);
    StringBuilder s0=a.append(a1);
    System.out.println(s0.toString());
    String l=String.format("%s,%s",s1,s2);
    String l1=String.join("",s1,s2);
    System.out.println(l);
    System.out.println(l1);
    
    








   }
}
