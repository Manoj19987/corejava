class SubNumber{
public static void main(String []args){
 System.out.print("main method started");
 add(1,24);//calling method
 add(7,23);
 add(89,45);
System.out.print("main method ended ");
   }
 // call method 
 public static void add(int a, int b){
System.out.println("inside add()");
System.out.println(a-b);

   }
} 

