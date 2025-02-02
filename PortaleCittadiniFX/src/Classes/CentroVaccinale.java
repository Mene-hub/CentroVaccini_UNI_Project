package Classes;

import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Classe per la creazione di un nuovo Centro Vaccinale.
 * @author Cavallini Francesco
 * @since 26/04/2021
 */
public class CentroVaccinale extends RecursiveTreeObject<CentroVaccinale>{

    public String nome;
    public Indirizzo indirizzo;
    public Tipologia tipologia;
    public LinkedList<Short> IDVaccinazioni;

    public StringProperty nome2;
    public StringProperty indirizzo2;
    public StringProperty tipologia2;

    //questo deve venire cambiato ogni volta che si vuole usare un compare to oppure un equals per stabulire se usare l'ordine alfabeto o l'ordine posizione simulato


    /**
     * Costruttore della classe CentroVaccinale
     *
     * @param nome           nome del Centro Vaccinale
     * @param indirizzo      indirizzo di dove è situato il Centro Vaccinale
     * @param tipologia      tipologia del Centro Vaccinale
     * @param idVaccinazione chiave esterna per poter cercare le vaccinazioni effettuate ai clienti registrati al centro
     */
    public CentroVaccinale(String nome, Indirizzo indirizzo, Tipologia tipologia, LinkedList<Short> idVaccinazione) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.tipologia = tipologia;
        this.IDVaccinazioni = idVaccinazione;

        nome2 = new SimpleStringProperty((String) nome);
        indirizzo2 = new SimpleStringProperty((String) indirizzo.toString());
        tipologia2 = new SimpleStringProperty((String) tipologia.toString());
    }

    public CentroVaccinale(String nomeCentroVaccinale, String nome, String cognome, String codiceFiscale, String dataSomministrazione, Vaccini vaccino, short idVaccinazione) {
    }

    /**
     * @return Variabili della classe Centro Vaccinale
     */
    @Override
    public String toString() {
        return "CentroVaccinale{" +
                "nome='" + nome + '\'' +
                ", indirizzo=" + indirizzo +
                ", tipologia=" + tipologia +
                ", idVaccinazione=" + IDVaccinazioni +
                '}';
    }


}