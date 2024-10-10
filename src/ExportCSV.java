import java.util.ArrayList;

public class ExportCSV extends Export{
    @Override
    public void ausgeben(ArrayList<Artikel> artikelliste) {

        for (Artikel artikel : artikelliste) {
            System.out.println("Nummer;Bezeichnung;Einkaufspreis;Ablaufdatum;Kategorienummer");
            System.out.println(artikel.getNummer() + ";" + artikel.getBezeichnung()
                    + ";" + artikel.getEinkaufspreis() + ";" + artikel.getAblaufdatum()
                    + ";" + artikel.getKategorienummer());
        }

    }
}
