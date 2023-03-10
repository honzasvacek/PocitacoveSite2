import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        //navázání spojení na Ivánkův počítač
        Socket socket = new Socket("192.168.81.7",10000);

        //Ivan mezitím poslouchá na portu, na který se připojuji:

        //Posílám Ivanovi data
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        out.println("HTTP/1.0 200");
        out.println("Seš jeblá Kunda");

    }
}