import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

// Program to run a server - socket programming
public class Server1 {

		private Socket socket = null;
		private ServerSocket server = null;
		
		private DataInputStream in = null;
		
		public Server1(int port)
		{
			
			try {
				server = new ServerSocket(port);
				System.out.println("S : Server started ");
				System.out.println("S : Waiting for a client ");
				socket  = server.accept();
				System.out.println("S : Client accepted ");
				
				in =  new  DataInputStream( new BufferedInputStream(socket.getInputStream()));
				
				String str = "";
				
				while( !str.equals("Over"))
				{
					str = in.readUTF();
					System.out.println(str);
				}
				
				System.out.println("S : Closing connection");
				socket.close();
				in.close();
			} 
			catch (IOException e) 
			{ 
				e.printStackTrace();
			}
		}
		
		public static void main(String[] args) {
		 
		int port = 7777;
		Server1 server = new Server1(port);
		
	}

}
