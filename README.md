# ITS-Prodigi-V1.0

Prima di leggere questo, La prego di leggere il file 'README PRINCIPALE.md', che contiene anche una procedura dettagliata su come aprire ed utilizzare questi programmi

Questo è stato il mio primo progetto in Java ed è anche il programma più semplice tra i tre. Infatti, consiste solo in due classi: una è la classe principale chiamata "Main", mentre l'altra è la classe "Studente". 

Richiede alcuni input dall'utente per popolare i dati personali dello studente e procedere poi al pagamento dei suoi insegnamenti inseriti.


---

# Dimostrazione

Una volta eseguito il programma, richiede all'utente di inserire qualche input. Come dimostrato qui a seguito:
![image](https://github.com/gianni-jin14/ITS-Prodigi-V1.0/assets/129873947/208d87ce-4582-49f9-ad7b-be1e5dcb500a)

---

# Pagina Main

Il costruttore della classe **Main** è un costruttore vuoto (senza parametri). Viene chiamato quando viene creato un oggetto di tipo **Main**.


Il metodo **main** è il metodo principale del programma. Viene eseguito quando si avvia il programma. Ecco cosa fa:
- Richiede all'utente di inserire il numero di studenti iscritti.
- Crea un oggetto **Scanner** per l'input da tastiera.
- Legge il numero di studenti inserito dall'utente.
- Crea un array di oggetti **Studente** chiamato **studenti** con una dimensione basata sul numero inserito
- Utilizza un ciclo **for** per creare nuovi oggetti **Studente** e li memorizza nell'array **studenti**.Dopo aver creato tutti gli studenti, utilizza un altro ciclo for per visualizzare i dettagli di ciascuno studente.

In sostanza, questo metodo è responsabile della creazione degli oggetti **Studente** e della loro visualizzazione.



----


# Classe Studente

## Sintesi
Questa classe consente di creare oggetti studente, di raccogliere informazioni su di loro, di gestire l'iscrizione agli insegnamenti, di visualizzare il saldo e di effettuare pagamenti delle tasse. Gli attributi e i metodi all'interno della classe forniscono funzionalità per la gestione di dettagli specifici di uno studente universitario.


Le variabili di istanza della classe sono i seguenti 
 - **nome** e **cognome**: Variabili di tipo **String** che memorizzano il nome e il cognome dello studente.
 - **corso**: Variabile di tipo **int** che rappresenta il corso di studio dello studente.
 - **idStudente**: Variabile di tipo **String** che rappresenta un ID univoco generato per lo studente.
 - **insegnamenti**: Variabile di tipo **String** che tiene traccia degli insegnamenti a cui lo studente è iscritto.
 - **saldo**: Variabile di tipo **double** che rappresenta il saldo associato allo studente.
 - **insegnamentoCosto**: Variabile di tipo **double** che rappresenta il costo di ciascun insegnamento.
 - **id**: Variabile di tipo **int** utilizzata per generare l'ID univoco degli studenti.


---
## Costruttore
C'e' un costruttore per classe Studente.  Quando viene creato un oggetto Studente, questo costruttore viene chiamato. Raccoglie le informazioni dell'utente tramite l'input da tastiera, inclusi il nome, il cognome, il corso di studio e gestisce l'iscrizione agli insegnamenti.


---

## Metodi

Per quanto riguarda i metodi della classe: 

Il metodo **setStudenteId**:  è privato e viene utilizzato per impostare l'ID univoco dello studente basato sul corso di studio e un contatore statico. Viene chiamato internamente dal costruttore.


Il metodo **iscrizione** gestisce l'iscrizione agli insegnamenti da parte dello studente. Gli insegnamenti vengono aggiunti all'elenco degli insegnamenti a cui lo studente è iscritto e il saldo viene aggiornato di conseguenza. L'utente può uscire dalla procedura inserendo 'U'.

Il metodo **visualizziSaldo** visualizza il saldo attuale dello studente.

Il metodo **paghiTasse** gestisce il pagamento delle tasse da parte dello studente. Richiede l'importo da pagare e aggiorna il saldo.

Il metodo **toString** restituisce una rappresentazione in formato stringa degli attributi dello studente. È utile per la visualizzazione dei dettagli dello studente.
