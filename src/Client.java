import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {

        /** O ip vem do args[0] só para o caso se quiser rodar em máquinas diferentes, 
         * mas não vamos tratar se ip é correto e similares...
         */

        String host = args.length == 1? args[0] : "127.0.0.1";

        Socket socket = new Socket(host, 4660);

        Scanner scanner = new Scanner(socket.getInputStream());
        
        while(true) {
            System.out.println(scanner.nextLine());
        }

    }
}
