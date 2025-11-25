package ejemploServidor2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    public static void main(String[] args) {
        // necesitamos las siguientes variables serversocket, socket y el puerto donde conectar.
        ServerSocket servidor = null;
        Socket sc = null;
        final int PUERTO = 5000;
        //estas dos clases son para recibir y enviar la informacion desde cliente y servidor.
        DataInputStream in;
        DataOutputStream out;

        // Para inicializarlo, me pedirá una excepción para los errores.
        try {
            servidor = new ServerSocket(PUERTO);
            System.out.println("servidor iniciado");

            // vamos a hacer que el servidor esté siempre escuchando, por tanto utilizaremos un while true
            while (true){
                // aquí utilizamos el socket que va a empezar a recibir las peticiones.
                sc = servidor.accept();

                // guardamos en las variables, la info del socket.
                System.out.println("Cliente conectado.");
                in = new DataInputStream(sc.getInputStream());
                out = new DataOutputStream(sc.getOutputStream());

                String mensaje = in.readUTF(); // se queda esperando a leer la peticion del cliente.
                System.out.println(mensaje);

                out.writeUTF("Hola mundo, desde el server"); // respondemos.
                sc.close(); // cerramos el cliente que ha conectado con el socket.
                System.out.println("Cliente desconectado.");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
