
class ThreadChiffres extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }
}

class ThreadLettres extends Thread {
    public void run() {
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + " ");
        }
    }
}

