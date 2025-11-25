package ejemploServidor2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Cliente {
    public static void main(String[] args) throws IOException {

        // guardamos estas dos constantes que necesitamos para la conexion.
        final String HOST="localhost"; // esto hace referencia a mi maquina, pero podría poner la direccion ip.
        final int PUERTO = 5000;
        DataInputStream in;
        DataOutputStream out;
        //Creamos una clase socket y le pasamos las constantes.
        try (Socket sc = new Socket(HOST, PUERTO)) {

            // utilizamos las mismas clases para sacar la info, en caso de estar con datainput y output, seguimos mejor con este
            // tipo de clase, si utilizamos bufferreader, mejor utilizarlo en los dos, server y client, pero siempre la misma clase
            // para evitar problemas.

            // Iniciamos int y out con el socket
            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());

            out.writeUTF("Hola mundo, desde el cliente."); // el mensaje que le mandamos al servidor.
            String mensaje = in.readUTF(); // aqui lo que va a recibir del servidor.
            System.out.println(mensaje);
            sc.close(); // desconectamos el cliente.
        }catch (IOException ex){
            System.out.println(ex);
        }

    }
}
