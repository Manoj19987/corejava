class TestTree{
 public static void main(String []args){
    Tree str=new Tree();
	String TreeName=str.name;
	float Height=str.height;
	long Leaves=str.noOfLeaves;
	
	str.grow();
	String res=str.cutting();
	
	System.out.println(TreeName);
	System.out.println(Height);
	System.out.println(Leaves);
	System.out.println(res);
 }
	
}