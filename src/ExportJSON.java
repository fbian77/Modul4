import java.util.ArrayList;

public class ExportJSON extends Export {
    @Override
    public void ausgeben(ArrayList<Artikel> artikelliste) {
        System.out.println("[");

        for (Artikel artikel : artikelliste) {
            // Objektbeginn
            System.out.println("  {");
            System.out.println("    \"Nummer\": " + artikel.getNummer() + ",");
            System.out.println("    \"Bezeichnung\": \"" + artikel.getBezeichnung() + "\",");
            System.out.println("    \"Einkaufspreis\": " + artikel.getEinkaufspreis() + ",");
            System.out.println("    \"Ablaufdatum\": \"" + artikel.getAblaufdatum() + "\",");
            System.out.println("    \"Kategorienummer\": " + artikel.getKategorienummer());
            System.out.println("  }");


        }
        System.out.println("]");
    }
}
