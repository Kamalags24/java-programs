import javax.swing.event.SwingPropertyChangeSupport;

import java.lang.reflect.Method;
import java.util.*;
class dynamicArray{

    private int arr[];
  private  int size ,intialcapacity=16;
  private  int capacity;
    dynamicArray(){
        size=0;
        arr = new int[intialcapacity];
        capacity=16;
    }
    private void expandArray(){
        capacity *=2;
        arr=java.util.Arrays.copyOf(arr, capacity);
    }
    public void add(int val){
        if(size==capacity)
          expandArray();
        arr[size++]=val;

    }
    public void display() {
        System.out.println("elements in list");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+",");
    
    }
    System.out.println();
        
    }
    public void insertpos(int pos,int val) {
     if(size==capacity){expandArray();}
        for(int i=size-1;i>pos;i--){
            arr[i+1]=arr[i];
        }
    arr[pos]=val;
    size++;
        

    }
    public void delpos(int pos) {
        for(int i=pos+1;i>size;i++){
            arr[i-1]=arr[i];
        }
        size--;
        if(capacity>intialcapacity && capacity>3*size){
            shrinkArray();
        }
    }
    public void shrinkArray() {
        capacity /=2;
        arr= java.util.Arrays.copyOf(arr, capacity);
        
    }

    
}
public class ArrayImplemetation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        dynamicArray d=new dynamicArray();
    int val,pos;

    while(true){
        System.out.println("----------------------------------------------------------------");
    System.out.println("1.insert at end");
    System.out.println("2.display list");
    System.out.println("3.insert at position");
    System.out.println("4.delete at position");
    System.out.println("5.exit");
    System.out.println("enter choice");
int choice =sc.nextInt();
switch(choice){
    case 1:
  System.out.println("enter num");
  val=sc.nextInt();
  d.add(val);
  break;
  case 2: 
 d.display();
  break;
  case 3: System.out.println("enter pos");
pos=sc.nextInt();
System.out.println("enter val");
  val=sc.nextInt();
  d.insertpos(pos,val);
  break;
  case 4: System.out.println("enter pos");
  pos=sc.nextInt(); val=sc.nextInt();
 d.delpos(pos);
  break;
  case 5: System.exit(0);
    
 default : System.out.println("invalid"); 
}







}    
    }}
