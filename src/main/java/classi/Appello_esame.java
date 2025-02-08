package classi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;

public class Appello_esame {
    private HashMap<String,Prenotazione> reservation_list;
    private String ID_appello;
    private LocalTime Orario;
    private LocalDate Data;
    private String Luogo;
    private int postiDisponibili;
    private String Tipologia;
    private Insegnamento insegnamento;

    public Appello_esame(String ID_appello, LocalTime orario, LocalDate data, String luogo, int postiDisponibili,
                         String tipologia, Insegnamento insegnamento) {
        this.ID_appello = ID_appello;
        Orario = orario;
        Data = data;
        Luogo = luogo;
        this.postiDisponibili = postiDisponibili;
        Tipologia = tipologia;
        this.insegnamento = insegnamento;
    }

    public Appello_esame() {};

    public String getID_appello() {
        return ID_appello;
    }

    public void setID_appello(String ID_appello) {
        this.ID_appello = ID_appello;
    }

    public LocalTime getOrario() {
        return Orario;
    }

    public void setOrario(LocalTime orario) {
        Orario = orario;
    }

    public LocalDate getData() {
        return Data;
    }

    public void setData(LocalDate data) {
        Data = data;
    }

    public String getLuogo() {
        return Luogo;
    }

    public void setLuogo(String luogo) {
        Luogo = luogo;
    }

    public int getPostiDisponibili() {
        return postiDisponibili;
    }

    public void setPostiDisponibili(int postiDisponibili) {
        this.postiDisponibili = postiDisponibili;
    }

    public String getTipologia() {
        return Tipologia;
    }

    public void setTipologia(String tipologia) {
        Tipologia = tipologia;
    }

    public Insegnamento getInsegnamento() {
        return insegnamento;
    }

    public void setInsegnamento(Insegnamento insegnamento) { this.insegnamento = insegnamento; }

    public void aggiungiPrenotazione(Prenotazione prenotato) {

        reservation_list.put(prenotato.getID_prenotazione(),prenotato);
    }

    public HashMap<String, Prenotazione> getPrenotazioniStudenti(String ID_appello){

        if(ID_appello.equals(this.ID_appello)){

            return reservation_list;
        } else {

            return new HashMap<>();
        }
    }

    @Override
    public String toString() {

        String insegnamentoNome = (insegnamento != null) ? insegnamento.getNome() : "Sconosciuto";
        String docenteNomeCompleto = (insegnamento != null && insegnamento.getDocente() != null) ?
                insegnamento.getDocente().getNome() + " " + insegnamento.getDocente().getCognome() :
                "Sconosciuto";

        return "Appello_esame{" +
                "ID_appello='" + ID_appello + '\'' +
                ", Orario=" + Orario +
                ", Data=" + Data +
                ", Luogo='" + Luogo + '\'' +
                ", postiDisponibili=" + postiDisponibili +
                ", Tipologia='" + Tipologia + '\'' +
                ", insegnamento=" + insegnamentoNome +
                ", docente='" + docenteNomeCompleto + '\'' +
                '}';
    }
}
