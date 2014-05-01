import java.io.*;
import java.net.*;
public class dynmulticastSend2
{
  public static void main(String[] args) {
    DatagramSocket socket1 = null;
    DatagramPacket outPacket1 = null;
    byte[] outBuf1;
    final int PORT = 8888;
 
    try {
      socket1 = new DatagramSocket();
      long counter = 0;
      String msg;
 
      while (true) {
        msg = "This is multicast! " + counter;
        counter++;
        outBuf1 = msg.getBytes();
 
        //Send to multicast IP address and port
        InetAddress address1 = InetAddress.getByName("224.2.2.2");
        outPacket1 = new DatagramPacket(outBuf1, outBuf1.length, address1, PORT);
 
        socket1.send(outPacket1);
 
        System.out.println("Server sends : " + msg);
        try {
          Thread.sleep(500);
        } catch (InterruptedException ie) {
        }
      }
    } catch (IOException ioe) {
      System.out.println(ioe);
    }
  }
}
