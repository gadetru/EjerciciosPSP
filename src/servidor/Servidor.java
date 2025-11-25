package servidor;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    private final int PUERTO = 4321; //no va a cambiar
    private ServerSocket serverSocket;
    private Socket socket;
    
    //Definimos el constructor
    public Servidor() throws IOException {
        serverSocket = new ServerSocket(PUERTO); //Definimos la conexion
        socket = new Socket(); //Iniciamos el cliente
    }
    
    //Funcion para iniciar la conexion
    public void iniciarServer() throws IOException {
        
    	//Vamos a aceptar los datos que llegaran del cliente
    	while (true) {
            System.out.println("Esperando la conexion del cliente");
            socket = serverSocket.accept(); //guardamos la peticion que llegue al servidor en socket
            // El servidor se queda a la espera de recibir peticiones

            //Al recibir la peticion, iniciamos la conexion
            DataOutputStream mensajeCliente = new DataOutputStream(socket.getOutputStream());
            //Enviamos mensaje al cliente
            mensajeCliente.writeUTF("Peticion rebida");

            DataInputStream entrada = new DataInputStream(socket.getInputStream());

            String mensajeDeCliente;

            try {
                while (true) {
                    mensajeDeCliente = entrada.readUTF();
                    System.out.println(mensajeDeCliente);
                }
            } catch (EOFException ex) {
                System.out.println("Fin de la comunicacion");
            }
        }
    }

    public void finalizarServer() throws IOException {
        serverSocket.close();
    }

}
