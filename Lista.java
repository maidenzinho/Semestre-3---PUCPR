import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<String>();
        tarefas.add("Estudar POO");
        tarefas.add("Fazer exercícios");
        tarefas.add("Revisar código");

        System.out.println("Segunda tarefa: " + tarefas.get(1));
    }
}