package PrimerEjemplo00;

public class MiHilo extends Thread {
    private String name;

        public MiHilo(String name){
            this.name = name;
        }
        // el metodo run siempre va a ser el que se ejecute cuando el hilo se inicializa

    public void run(){
        System.out.println("Hola desde el hilo " + name);
    }
}
