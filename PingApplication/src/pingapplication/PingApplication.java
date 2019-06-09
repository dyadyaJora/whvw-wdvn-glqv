package pingapplication;

import java.util.Scanner;

public class PingApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input server name:");
        String testedServerName = sc.nextLine();
        
        boolean available = Pinger.isAvailable(testedServerName);
        
        if (available) {
            System.out.println("Server is available");
        } else {            
            System.out.println("[ERROR] Server is not available");
        }
    }
    
}
