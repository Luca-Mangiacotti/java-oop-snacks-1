public class RegistroStudenti {
    private Studente[] registro;

    // metodo costruttore per inizializzare il registro

    public RegistroStudenti() {
        this.registro = new Studente[0];
    }

    // metodo per leggere il registro
    public Studente[] getRegistro() {
        return this.registro;
    }

    // metodo setter per il registro
    public void setRegistro(Studente[] registro) {
        this.registro = registro;

    }

    // metodo per aggiungere uno studente al registro
    public void AddStudente(Studente studente) {
        // creazione di un nuovo array per il registro con una lunghezza +1 del registro
        // attuale
        Studente[] nuovoRegistro = new Studente[this.registro.length + 1];
        // copiamo il registro nel nuovo array registro
        for (int i = 0; i < this.registro.length; i++) {
            nuovoRegistro[i] = registro[i];
        }
        // aggiungiamo il nuovo studente all'ultimo posto dell'array
        nuovoRegistro[nuovoRegistro.length - 1] = studente;
        // aggiorniamo il registro con il nuovo array
        this.registro = nuovoRegistro;

    }

    // metodo per restituire in stringa il registro degli studenti
    public String toString() {
        String stampaOutput = "Registro Studenti: \n";
        for (Studente studente : this.registro) {
            stampaOutput += String.format(" %s; \n", studente.ConcatData());
        }
        return stampaOutput;
    }

}
