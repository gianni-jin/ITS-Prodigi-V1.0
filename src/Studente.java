

import java.util.Scanner;
/**
 * Questa classe rappresenta un oggetto studente con dettagli sul suo nome, cognome, corso di studio, ID studente,
 * insegnamenti a cui è iscritto e il saldo associato.
 */
public class Studente {
    private String nome;
    private String cognome;
    private int corso;
    private String idStudente;
    private String insegnamenti = "";
    private double saldo = 0.0;
    private static double insegnamentoCosto = 100.0;
    private static int id = 1000;

    /**
     * Costruttore della classe Studente che raccoglie le informazioni dell'utente tramite input da tastiera.
     * Inizializza il nome, cognome, corso di studio, ID studente e gestisce l'iscrizione agli insegnamenti.
     */
    public Studente() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserire il nome: ");
        this.nome = sc.nextLine();
        System.out.print("Inserire il cognome: ");
        this.cognome = sc.nextLine();
        System.out.print("Inserire il nome completo del corso di studio o digiti -1 per annullare l'operazione:\n" +
                "1 - Cyber Security & Cloud Specialist\n" +
                "2 - Digital Commerce and Performance Manager\n" +
                "3 - Full Stack Developer & Integrator\n" +
                "4 - Sviluppatore VR per Metaverso e Gaming\n" +
                "5 - Cloud Developer\n" +
                "6 - Data Management Specialist\n" +
                "Inserire il numero corrispondente al corso desiderato: ");

        try {
            this.corso = sc.nextInt();
            this.setStudenteId();
            this.iscrizione();
        } catch (Exception var3) {
            System.out.println("Voce non valida");
        }
    }

    /**
     * Imposta l'ID univoco dello studente basato sul corso di studio e un contatore statico.
     */
    private void setStudenteId() {
        ++id;
        this.idStudente = corso + "" + id;
    }

    /**
     * Gestisce l'iscrizione agli insegnamenti da parte dello studente.
     * Gli insegnamenti vengono aggiunti all'elenco degli insegnamenti a cui lo studente è iscritto e
     * il saldo viene aggiornato di conseguenza.
     * L'utente può uscire dalla procedura inserendo 'U'.
     */
    public void iscrizione() {
        while (true) {
            System.out.print("Inserire gli insegnamenti a cui si iscrive (Digitare U per uscire): ");
            Scanner sc = new Scanner(System.in);
            String insegnamento = sc.nextLine();
            if (insegnamento.equals("U")) {
                this.paghiTasse();
                return;
            }

            this.insegnamenti = this.insegnamenti + insegnamento + ", ";
            this.saldo += insegnamentoCosto;
        }
    }

    /**
     * Visualizza il saldo attuale dello studente.
     */
    public void visualizziSaldo() {
        System.out.println("Il suo saldo è: " + this.saldo + "€");
    }

    /**
     * Gestisce il pagamento delle tasse da parte dello studente.
     * Richiede l'importo da pagare e aggiorna il saldo.
     */
    public void paghiTasse() {
        this.visualizziSaldo();
        System.out.print("Ogni insegnamento costa " + insegnamentoCosto + " €.");
        System.out.print("\nInserisci l'importo che deve pagare: ");
        Scanner in = new Scanner(System.in);
        double pagamento = in.nextDouble();
        this.saldo -= pagamento;
        System.out.println("-------------------------------------------");
        System.out.println("**Lo/la studente/studentessa " + this.nome + " " + this.cognome + " ha pagato " + pagamento + "**");
        this.visualizziSaldo();
        System.out.println("-------------------------------------------");
    }

    /**
     * Restituisce una rappresentazione in formato stringa degli attributi dello studente.
     * Utile per la visualizzazione dei dettagli dello studente.
     */
    public String toString() {
        return "Sommario dell'operazione: [Nome e cognome=" + this.nome + " " + this.cognome +
                "; Codice del corso =" + this.corso + "; Studente id=" + this.idStudente +
                "; Insegnamenti iscritti= {" + this.insegnamenti + "}; Saldo disponibile=" + this.saldo + "]";
    }
}
