class TestMonument{
  public static void main(String []args){
  Monument monument=new Monument("taj");
  String res=monument.printAll();
  System.out.println(res);
  
   short yoc=1631;
   Monument monument1=new Monument("taj","agra",yoc,42.5f);
   System.out.println(monument1.printAll());
  
  }


}