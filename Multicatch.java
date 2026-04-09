public class Multicatch{
  public static void main(String []args){
   try{
      int[]num={1,2,3};
System.out.println(num[3]);
int result=10/0;
}
catch (ArrayIndexOutOfBoundsException e){
System.out.println("ArrayIndexOutOfBoundsException"+e.getMessage());
}
catch(ArithmeticException e){
System.out.println("Arthematic error:"+e.getMessage());
}

catch(Exception e){
System.out.println("unexpected error"+e.getMessage());
}
}
}
