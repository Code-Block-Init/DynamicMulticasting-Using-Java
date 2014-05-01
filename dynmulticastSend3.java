import java.io.*;
import java.net.*;
public class dynmulticastSend3
{
  public static void main(String[] args) {
    DatagramSocket socket2 = null;
    DatagramPacket outPacket2 = null;
    byte[] outBuf2;
    final int PORT = 8888;
 
    try {
      socket2 = new DatagramSocket();
      long counter = 0;
      String msg;
 
      while (true) {
        msg = "This is multicast! " + counter;
        counter++;
        outBuf2 = msg.getBytes();
 
        //Send to multicast IP address and port
        InetAddress address2 = InetAddress.getByName("224.2.2.3");
        outPacket2 = new DatagramPacket(outBuf2, outBuf2.length, address2, PORT);
 
        socket2.send(outPacket2);
 
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
