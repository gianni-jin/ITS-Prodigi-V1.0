import java.util.Scanner;

/**
 * Questa classe rappresenta il programma principale per la gestione degli studenti iscritti.
 * Gli studenti vengono creati e visualizzati tramite input da tastiera.
 */
public class Main {

    // Costruttore della classe Main
    public Main() {
    }

    /**
     * Il metodo principale del programma.
     * Richiede all'utente di inserire il numero di studenti iscritti, crea un array di oggetti Studente
     * basato sul numero inserito, e quindi visualizza i dettagli dei singoli studenti.
     * @param args Gli argomenti passati al programma (non utilizzati in questo caso).
     */
    public static void main(String[] args) {
        // Richiesta all'utente di inserire il numero di studenti iscritti
        System.out.print("Inserire il numero degli studenti iscritti: ");
        Scanner sc = new Scanner(System.in);
        int numeroStudenti = sc.nextInt();

        // Creazione di un array di oggetti Studente con dimensione basata sul numero inserito
        Studente[] studenti = new Studente[numeroStudenti];

        int n;
        for (n = 0; n < numeroStudenti; ++n) {
            // Creazione di un nuovo oggetto Studente per ciascuno degli studenti
            studenti[n] = new Studente();
        }

        // Visualizzazione dei dettagli degli studenti creati
        for (n = 0; n < numeroStudenti; ++n) {
            System.out.println(studenti[n]);
        }
    }
}
