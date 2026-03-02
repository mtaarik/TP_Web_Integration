class Producteur implements Runnable {
    private FileAttente file;
    public Producteur(FileAttente f) { this.file = f; }
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                file.deposer(i);
                Thread.sleep(100); 
            }
        } catch (InterruptedException e) { e.printStackTrace(); }
    }
}

class Consommateur implements Runnable {
    private FileAttente file;
    public Consommateur(FileAttente f) { this.file = f; }
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                file.retirer();
                Thread.sleep(500); 
            }
        } catch (InterruptedException e) { e.printStackTrace(); }
    }
}