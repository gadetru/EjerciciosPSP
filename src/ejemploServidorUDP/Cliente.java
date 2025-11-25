package ejemploServidorUDP;

import java.io.IOException;
import java.net.*;

public class Cliente {
    public static void main(String[] args) {

        final int PUERTO_SERVIDOR = 5000;
        byte[] buffer = new byte[1024];


        try {
            InetAddress direccionServidor = InetAddress.getByName("localhost");
            // desde el cliente, no asignaremos un puerto, cuando el servidor necesite responderme, él lo va a buscar en mi peticion.
            DatagramSocket socketUDP = new DatagramSocket();

            String mensaje = "Hola mundo, desde el fokin kliente";
            buffer = mensaje.getBytes();

            DatagramPacket pregunta = new DatagramPacket(buffer, buffer.length,direccionServidor,PUERTO_SERVIDOR);
            System.out.println("envio el datagrama.");
            socketUDP.send(pregunta);

            DatagramPacket peticion = new DatagramPacket(buffer, buffer.length);
            System.out.println("recibo peticion");
            socketUDP.receive(peticion);

            String info = new String(peticion.getData());
            System.out.println(info);

            socketUDP.close();

        } catch (UnknownHostException | SocketException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
