package ejemploServidorUDP;

import java.io.IOException;
import java.net.*;

public class Servidor {
    public static void main(String[] args) {

        final int PUERTO = 5000;
        byte[] buffer = new byte[1024];

        try {
            System.out.println("iniciado el servidor UDP");
            DatagramSocket socketUDP = new DatagramSocket(PUERTO);

            while (true) {
                DatagramPacket peticion = new DatagramPacket(buffer, buffer.length);

                socketUDP.receive(peticion);

                System.out.println("recibo info del cliente.");
                String mensaje = new String(peticion.getData());
                System.out.println(mensaje);

                int puertoCliente = peticion.getPort();
                InetAddress direccion = peticion.getAddress();

                mensaje = "Hola mundo desde el server.";
                buffer = mensaje.getBytes();

                DatagramPacket respuesta = new DatagramPacket(buffer, buffer.length, direccion, puertoCliente);
                System.out.println("envio info al cliente");
                socketUDP.send(respuesta);
            }



        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
