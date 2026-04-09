class try catch demo
{
public static void main (String args [])
{
   try {
   int num[]={1,2,3,4};
   System.out.println(num[5]);
}    
   catch(ArrayIndexOutofBoundsException e)
{
System.out.println(e);
}
}
}