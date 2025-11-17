package ejercicio03;

public class Atleta implements Runnable{

    int corredor;

     public Atleta(int corredor){
         this.corredor = corredor;
     }

     @Override

    public void run(){
        int metros =(int) (Math.random() * 101);

         System.out.println("Soy el corredor " + corredor + " he recorrido " + metros + " metros");
     }
}
