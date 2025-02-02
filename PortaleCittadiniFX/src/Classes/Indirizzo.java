package Classes;

/**
 * Classe per la creazione di un Indirizzo (qualificatore, nome, numero civico, ..)
 * @since 26/04/2021
 * @author De Nicola Cristian
 */
public class Indirizzo
{


    public Qualificatore qualificatore;

    public String nome;
    public int numeroCivico;
    public String comune;
    public String provincia;
    public int cap;

    /**
     * Costruttore della classe Indirizzo.
     * @param qualificatore indica il tipo di indirizzo
     * @param nome nome della strada a cui fa riferimento l'indirizzo
     * @param numeroCivico numero civico della strada ove situato il centro
     * @param comune comune dove è situato il centro
     * @param provincia provincia dove è situato il centro
     * @param cap codice di avviamento postale del comune
     */
    public Indirizzo(Qualificatore qualificatore, String nome, int numeroCivico, String comune, String provincia, int cap)
    {
        this.qualificatore=qualificatore;
        this.nome=nome;
        this.numeroCivico=numeroCivico;
        this.comune=comune;
        this.provincia=provincia;
        this.cap=cap;
    }

    /**
     *
     * @return variabili della classe Indirizzo
     */
    @Override
    public String toString() {
        return  comune +"(" +provincia +"), "
                + qualificatore + " "
                + nome + ", \'"
                + numeroCivico
                +"\', cap:" + cap;
    }
}

