public class MainExercice {

    public static void main(String[] args) throws InterruptedException {
        
        //  question 1 
        /*
        System.out.println("Question 1 :");
        TraitementSequentiel traitementSeq = new TraitementSequentiel();
        traitementSeq.executer();
        */

        // --- Question 2 : 
        /* 
        System.out.println("Question 2 :");
        ThreadChiffres t1 = new ThreadChiffres();
        ThreadLettres t2 = new ThreadLettres();
        
        t1.start();
        t2.start(); */

        // --- Question 6 : 
        /*
        System.out.println("\n=== Question 6 : Priorités ===");
        ThreadChiffres tChiffres = new ThreadChiffres();
        ThreadLettres tLettres = new ThreadLettres();
        
        tChiffres.setPriority(Thread.MIN_PRIORITY); 
        tLettres.setPriority(Thread.MAX_PRIORITY);  
        
        tChiffres.start();
        tLettres.start(); */

        System.out.println("\n=== Question 7 : Avec join() ===");
        ThreadChiffres tJoin1 = new ThreadChiffres();
        ThreadLettres tJoin2 = new ThreadLettres();
        
        tJoin1.start();
        tJoin1.join(); 
        
        tJoin2.start();
    }
} 