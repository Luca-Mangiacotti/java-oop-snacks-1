public class Studente {

    // attributi della classe Studente
    private String name;
    private String surname;
    private String age;

    // metodo costruttore
    public Studente(String name, String surname, String age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    // metodo per concatenare i dati dello studente
    public String ConcatData() {
        return this.name.substring(0, 1).toUpperCase() + this.name.substring(1).toLowerCase() + " "
                + this.surname.substring(0, 1).toUpperCase() + this.surname.substring(1).toLowerCase() + ", " + this.age
                + " anni";
    }

}
