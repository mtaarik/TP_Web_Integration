public class TraitementSequentiel {
    public void executer() {
        // T1 : Nombres de 1 à 10
        System.out.println("Début T1 (Chiffres) :");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nFin T1");

        // T2 : Lettres de a à z
        System.out.println("Début T2 (Lettres) :");
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + " ");
        }
        System.out.println("\nFin T2");
    }
}