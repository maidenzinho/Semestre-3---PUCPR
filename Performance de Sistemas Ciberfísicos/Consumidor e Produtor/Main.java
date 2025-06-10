
import java.util.ArrayList;
import java.util.Random;

class Consumidor extends Thread{
    private ArrayList<Integer> lista;
    private int id;
    public Consumidor(int id, ArrayList<Integer> lista){
        this.id = id;
        this.lista = lista;
    }
    public void run(){
        Random random = new Random();
        while (true){
            int dado = random.nextInt(1000);
            synchronized (this.lista) {
                while (this.lista.size() <= 5){
                    try {
                        this.lista.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                this.lista.add(dado);
                this.lista.notifyAll();
                System.out.println("Consumidor " + this.id + " " + this.lista);
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
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
        Random random = new Random();
        while (true){
            int dado = random.nextInt(1000);
            synchronized (this.lista) {
                while (this.lista.size() >= 5){
                    try {
                        this.lista.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                this.lista.add(dado);
                this.lista.notifyAll();
                System.out.println("Produtor " + this.id + " " + this.lista);
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Main{
    public static void main(String[] args) {
    }
}