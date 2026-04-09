import java.io.FileOutputStream;
public class Fileoutput stream{
 public static void main(String args[]){
    try{
      FileOutStream fout=new FileOutStream("D:\\testout.txt");
      String s="Welcome to java point.";
      byte b[]=s.getBytes();
      fout.write(b);
      fout.close();
      System.out.println("Sucess");
      }catch(Expection e){System.out.println(e);}
}
}