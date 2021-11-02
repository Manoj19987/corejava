class TestCow{
  public static void main(String []manu){
  Cow str= new Cow();
  String Name=str.name;
  float Height=str.height;

  String Colour=str.colour;
  
 str.eating();
 String res=str.eating();
 
 System.out.println(Name);
 System.out.println(Height);

 System.out.println(Colour);
 
 System.out.println(res);
 
}
}