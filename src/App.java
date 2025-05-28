public class App {
    public static void main(String[] args) throws Exception {

        // creazione di uno studente
        System.out.println("Snack 1: Studente");
        Studente StudenteGiovanni = new Studente("gioVAnNI", "PASCALI", "20");
        System.out.println(StudenteGiovanni.ConcatData());
        System.out.println("----------------------");
        System.out.println("----------------------");

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

    }
}
