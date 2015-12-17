Dynamic Multicasting
==========
```
ALGORITHM:

(a) Client:
1. Create datagram socket
DatagramSocket <Datagram socket name> = null;
2. Create datagram packet
DatagramPacket <Datagram packet name> = null;
3. Send to multicast IP address and port
InetAddress <address name> = InetAddress.getByName("<IP address>");
<datagram packet name> = new DatagramPacket(<buffer name>, <buffer name>.length, <address name>, PORT);
<Datagram socket name>.send(<Datagram packet name>);

(b) Server:
1. Create multicast socket
MulticastSocket <multicast socket name> = null;
2. Create datagram packet for server
DatagramPacket <name> = null;
3. Prepare to join multicast group
<multicast socket name> = new MulticastSocket(<port number>);
InetAddress <address name from client-1> = InetAddress.getByName("<port number of client-1>");
InetAddress <address name from client-2> = InetAddress.getByName("<port number of client-2>");
InetAddress <address name from client-3> = InetAddress.getByName("<port number of client-3>");
<multicast socket name>.joinGroup(address);
```
```
Source code:
dynmulticastSend1.java
dynmulticastSend2.java
dynmulticastSend3.java
dynmulticastReceive.java
```
```
Wrote it during MTech 2nd semester (2014)
```
