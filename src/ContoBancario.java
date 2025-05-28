public class ContoBancario {
    // attributi della classe ContoBancario
    private String numeroConto;
    private Double saldo;

    // metodo costruttore
    public ContoBancario(String numeroConto) {
        this.numeroConto = numeroConto;
        this.saldo = 0.0;
    }

    // metodo per restituire il numero del conto
    public String getNumeroConto() {
        return this.numeroConto;
    }

    // metodo per depositare sul conto
    public void Deposita(int importo) {
        this.saldo += importo;

    }

    // metodo per prelevare dal conto
    public void Preleva(int importo) {
        if (importo <= this.saldo) {
            this.saldo -= importo;
        } else {
            System.out
                    .println("Il tuo saldo di: " + this.saldo + " euro non è sufficiente per prelevare l'importo di: "
                            + importo + " euro richiesto.");
        }
    }

    // metodo per visualizzare il saldo corrente
    public Double VisualizzaSaldo() {
        return this.saldo;
    }

}
