public class MainExercice1 {

    public MainExercice1() throws InterruptedException {
        
        // sequential();          // Question 1
        // concurrentThread();    // Question 2
        // concurrentRunnable();  // Question 4
        // priorites();           // Question 6
        // avecJoin();            // Question 7
        
        //bankExercise();           // Exercice 2
        prodConsommateur();       // Exercice 3
    
    }

    // Question 1
    public void sequential() {
        System.out.println("=== Question 1 : Séquentiel ===");
        TraitementSequentiel seq = new TraitementSequentiel();
        seq.executer();
    }

    // Question 2
    public void concurrentThread() {
        System.out.println("=== Question 2 : Concurrent (Thread) ===");
        ThreadChiffres t1 = new ThreadChiffres();
        ThreadLettres t2 = new ThreadLettres();
        t1.start();
        t2.start();
    }

    // Question 4
    public void concurrentRunnable() {
        System.out.println("=== Question 4 : Concurrent (Runnable) ===");
        Thread t1 = new Thread(new RunnableChiffres());
        Thread t2 = new Thread(new RunnableLettres());
        t1.start();
        t2.start();
    }

    // Question 6
    public void priorites() {
        System.out.println("=== Question 6 : Priorités ===");
        ThreadChiffres t1 = new ThreadChiffres();
        ThreadLettres t2 = new ThreadLettres();
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }

    // Question 7
    public void avecJoin() throws InterruptedException {
        System.out.println("=== Question 7 : Avec Join ===");
        ThreadChiffres t1 = new ThreadChiffres();
        ThreadLettres t2 = new ThreadLettres();
        t1.start();
        t1.join(); 
        t2.start();
    }

    // Exercice 
    public void bankExercise() {
        System.out.println("=== Exercice 2 : Compte Commun ===");
        JobAhmedEtFatima job = new JobAhmedEtFatima();
        Thread ahmed = new Thread(job, "Ahmed");
        Thread fatima = new Thread(job, "Fatima");
        ahmed.start();
        fatima.start();
    }
    //exercice 3
    public void prodConsommateur() {
        System.out.println("=== Exercice 3 : Producteur/Consommateur ===");
        FileAttente filePartagee = new FileAttente(3); // Capacité de 3

        Thread p1 = new Thread(new Producteur(filePartagee));
        Thread c1 = new Thread(new Consommateur(filePartagee));

        p1.start();
        c1.start();
    }

    public static void main(String[] args) {
        try {
            new MainExercice1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}