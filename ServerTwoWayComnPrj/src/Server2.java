import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {

	public static void main(String[] args) throws IOException {
		
		int port = 7779;
		ServerSocket ss = new ServerSocket(port);
		
		System.out.println("S : Server running at " + port + ".  Waiting for the client ...");

		Socket s = ss.accept();
		
		System.out.println("S : Connection Estblished ");
		
		
		PrintStream ps = new PrintStream(s.getOutputStream());
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			
			String str,str1;
			
			while( (str =  br.readLine() ) != null ) {
				System.out.println("C : " + str);
				
				str1 = kb.readLine();
				ps.println(str1);
			}
				
			ps.close();
			br.close();
			kb.close();
			ss.close();
			s.close();
		
		}
		
	}

}
