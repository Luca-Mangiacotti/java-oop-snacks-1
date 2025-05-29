public class App {
    public static void main(String[] args) throws Exception {

        // SNACK 1

        // creazione di uno studente
        System.out.println("Snack 1: Studente");
        Studente StudenteGiovanni = new Studente("gioVAnNI", "PASCALI", "20");
        Studente StudentePaola = new Studente("Paola", "perego", "23");
        Studente StudenteMaurizio = new Studente("maurizio", "mattei", "21");
        Studente StudenteAnnamaria = new Studente("annamaria", "tarantino", "28");

        System.out.println(StudenteGiovanni.ConcatData());
        System.out.println("----------------------");
        System.out.println("----------------------");

        // SNACK 2

        System.out.println("Snack 2: Conto Bancario");
        // creazione di un conto bancario
        ContoBancario ContoGiovanni = new ContoBancario("gvn-6548");
        // deposito di 4000 euro
        ContoGiovanni.Deposita(4000);
        // visualizzazione del saldo
        System.out.println("Numero Conto: " + ContoGiovanni.getNumeroConto() + " Saldo corrente: "
                + ContoGiovanni.VisualizzaSaldo() + " euro");
        // prelievo di 1340 euro
        ContoGiovanni.Preleva(1340);
        // visualizzazione del saldo dopo il prelievo
        System.err.println("A seguire il saldo dopo un prelievo di 1340 euro ");
        ;
        System.out.println("Numero Conto: " + ContoGiovanni.getNumeroConto() + " Saldo corrente: "
                + ContoGiovanni.VisualizzaSaldo() + " euro");
        // tentativo di prelievo di 5000 euro
        System.err.println("A seguire il tentativo di prelievo di 5000 euro: ");
        ContoGiovanni.Preleva(5000);
        System.out.println("----------------------");
        System.out.println("----------------------");

        // SNACK 3
        System.out.println("Snack 3: Registro Studenti");
        // creazione di un registro studenti
        RegistroStudenti registroStudenti = new RegistroStudenti();

        System.out.println(registroStudenti);
        // aggiunta di due studenti al registro
        registroStudenti.AddStudente(StudenteGiovanni);
        registroStudenti.AddStudente(StudentePaola);
        // stampa del registro studenti
        System.out.println(registroStudenti.toString());

        // aggiunta di altri due studenti al registro
        registroStudenti.AddStudente(StudenteMaurizio);
        registroStudenti.AddStudente(StudenteAnnamaria);
        // stampa del registro studenti aggiornato
        System.out.println("Registro Studenti aggiornato: ");
        System.out.println(registroStudenti.toString());

    }
}
