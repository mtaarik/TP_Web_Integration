import java.util.LinkedList;

public class FileAttente {
    private LinkedList<Integer> buffer = new LinkedList<>();
    private int capacite;

    public FileAttente(int capacite) {
        this.capacite = capacite;
    }

    public synchronized void deposer(int item) throws InterruptedException {
        while (buffer.size() == capacite) {
            System.out.println("File PLEINE. Producteur en attente...");
            wait(); 
        }
        buffer.add(item);
        System.out.println("Produit : " + item + " (Taille : " + buffer.size() + ")");
        notifyAll(); 
    }

    public synchronized int retirer() throws InterruptedException {
        while (buffer.isEmpty()) {
            System.out.println("File VIDE. Consommateur en attente...");
            wait(); 
        }
        int item = buffer.removeFirst();
        System.out.println("Consommé : " + item + " (Taille : " + buffer.size() + ")");
        notifyAll(); 
        return item;
    }
}