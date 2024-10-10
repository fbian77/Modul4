import java.time.LocalDate;
import java.util.GregorianCalendar;

public class Artikel {
	
	private String nummer;
	private String bezeichnung;
	private double einkaufspreis;
	private LocalDate ablaufdatum;
	private int kategorienummer;
	
	public Artikel(String nummer, String bezeichnung, double einkaufspreis, LocalDate ablaufdatum,
			int kategorienummer) {
		super();
		this.nummer = nummer;
		this.bezeichnung = bezeichnung;
		this.einkaufspreis = einkaufspreis;
		this.ablaufdatum = ablaufdatum;
		this.kategorienummer = kategorienummer;
	}

	public String getNummer() {
		return nummer;
	}

	public void setNummer(String nummer) {
		this.nummer = nummer;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public double getEinkaufspreis() {
		return einkaufspreis;
	}

	public void setEinkaufspreis(double einkaufspreis) {
		this.einkaufspreis = einkaufspreis;
	}

	public LocalDate getAblaufdatum() {
		return ablaufdatum;
	}

	public void setAblaufdatum(LocalDate ablaufdatum) {
		this.ablaufdatum = ablaufdatum;
	}

	public int getKategorienummer() {
		return kategorienummer;
	}

	public void setKategorienummer(int kategorienummer) {
		this.kategorienummer = kategorienummer;
	}

	@Override
	public String toString() {
		return "Artikel{" +
				"nummer='" + nummer + '\'' +
				", bezeichnung='" + bezeichnung + '\'' +
				", einkaufspreis=" + einkaufspreis +
				", ablaufdatum=" + ablaufdatum +
				", kategorienummer=" + kategorienummer +
				'}';
	}
}
