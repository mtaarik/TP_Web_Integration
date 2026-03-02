import java.util.concurrent.locks.ReentrantLock;

public class JobAhmedEtFatima implements Runnable {
    private Compte compte = new Compte();
    private final ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            doRetrait(10);
            if (compte.getSolde() < 0) {
                System.out.println("ALERTE : Le compte est à découvert !"+
                                   " Solde: " + compte.getSolde() );
            }
        }
    }

    private void doRetrait(int montant) {
    // 1. On verrouille l'accès : Ahmed ou Fatima prend la clé.
    lock.lock(); 
    
    try {
       
        if (compte.getSolde() >= montant) {
            System.out.println(Thread.currentThread().getName() + " s'apprête à retirer.");
            
            try {
                Thread.sleep(200); 
            } catch (InterruptedException e) { 
                e.printStackTrace(); 
            }
            
            compte.retirer(montant);
            System.out.println(Thread.currentThread().getName() + " a fini le retrait. Solde: " + compte.getSolde());
        } else {
            System.out.println("Pas assez d'argent pour " + Thread.currentThread().getName());
        }
    } finally {
        lock.unlock();
    }
}
}