
import java.util.ArrayList;

class Consumidor extends Thread{
    private ArrayList<Integer> lista;
    private int id;
    public Consumidor(int id, ArrayList<Integer> lista){
        this.id = id;
        this.lista = lista;
    }
    public void run(){
        synchronized (this.lista){
            System.out.println("Começo Consumidor");
            try {
                this.lista.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Final Consumidor");
        }
    }
}

class Produtor extends Thread{
    private ArrayList<Integer> lista;
    private int id;
    public Produtor(int id, ArrayList<Integer> lista){
        this.id = id;
        this.lista = lista;
    }
    public void run(){
        synchronized (this.lista){
            System.out.println("Começo Produtor");
                this.lista.notify();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Final Produtor");
        }
    }
}

class Main{
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Consumidor consumidor = new Consumidor(1, lista);
        Produtor produtor = new Produtor(1, lista);

        consumidor.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        produtor.start();
    }
}