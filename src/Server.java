import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Server {
    public static void main(String[] args) throws Exception {

        /**
         * Aqui deveria ter uma lógica para criar uma thread para cada accept,
         * mais uma thread para ler do teclado um comando de finalização que 
         * manda um flag para cada thread ativa com um client para fechar conexão 
         * e etc... mas como é um exemplo rápido vamos só criar um servidor "mono-client"
         * que derruba sujo (quando interrompe o programa)
         */


        ServerSocket serverSocket = new ServerSocket(4660);
        System.out.println("Server iniciado na porta 4660");
        int cont = 0;
        Socket theClient = serverSocket.accept();
        
        PrintWriter writer = new PrintWriter(theClient.getOutputStream());
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        while(true){
            cont++;
            writer.println("ID:"+cont+" TIME:"+dateFormat.format(new Date()));
            writer.flush();
            Thread.sleep(2000);
        }
    }
}
