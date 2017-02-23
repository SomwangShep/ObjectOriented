import java.io.*;
public class DataInput_Stream {

   @SuppressWarnings("resource")
public static void main(String args[])throws IOException {

      // writing string to a file encoded as modified UTF-8
      //DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("C:\\players.txt"));
     // dataOut.writeUTF("hello");

      // Reading data from the same file
      DataInputStream dataIn = new DataInputStream(new FileInputStream("C:\\players.txt"));

      while(dataIn.available()>0) {
         String k = dataIn.readUTF();
         System.out.print(k+" ");
      }
   }
}