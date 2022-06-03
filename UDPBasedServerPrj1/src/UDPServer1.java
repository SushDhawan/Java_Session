import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer1 {

	public static void main(String[] args) throws IOException {
		 
		int port = 6666;
		DatagramSocket  ds = new DatagramSocket(port);
		
		byte[] receive = new byte[65535];
		
		DatagramPacket DpRx = null ;
		
		System.out.println("S : Up and running...");
		while (true) {
		
		DpRx = new DatagramPacket(receive, receive.length);
		ds.receive(DpRx);
		
		System.out.println("Data sent by Client  : " +  data(receive) );
		
		if (data(receive).toString().equals("bye"))
		{
			System.out.println("Client wants to exit ..");
			break;
		}
		receive = new byte[65535] ;
		}
	}

	private static StringBuilder data(byte[] r) {
		 
		if (r==null) 
			return null;

		StringBuilder  retString = new StringBuilder();
		int i =0;
		
		while (r[i] != 0) {
			retString.append((char) r[i]);
			i++;
		}
		return retString;
			
	}

}



