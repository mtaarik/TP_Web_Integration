public class MainExercice {

    public static void main(String[] args) throws InterruptedException {
        
        //  question 1 
        /*
        System.out.println("Question 1 :");
        TraitementSequentiel traitementSeq = new TraitementSequentiel();
        traitementSeq.executer();
        */

        // --- Question 2 : 
        System.out.println("Question 2 :");
        ThreadChiffres t1 = new ThreadChiffres();
        ThreadLettres t2 = new ThreadLettres();
        
        t1.start();
        t2.start();
        
        
    }
} 