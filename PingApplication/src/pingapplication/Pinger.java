package pingapplication;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

/**
 *
 * @author dyadyajora
 */
public class Pinger {
    static final int MAX_CONNECTION_TIMEOUT_MS = 5000;
    static final int TARGET_PORT = 8080;
    
    public static boolean isAvailable(String serverName) {
        Socket socket = new Socket();
        boolean available = false;
        
        try {
            socket.connect(
                    new InetSocketAddress(serverName, TARGET_PORT),
                    MAX_CONNECTION_TIMEOUT_MS
            ); 
            
            if (socket.isConnected()) {
                available = true;
                socket.close();
            }
        }
        catch(UnknownHostException | SocketTimeoutException e) {
            System.out.println(e.getMessage());
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
        
        return available;
    }
}
