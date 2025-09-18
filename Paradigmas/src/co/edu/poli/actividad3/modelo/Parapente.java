package co.edu.poli.actividad3.modelo;

public class Parapente {
    private String parapente;
    private String casco;
    private String arnes;
    private String GPS;

    public Parapente(String parapente, String casco, String arnes, String GPS) {
        this.parapente = parapente;
        this.casco = casco;
        this.arnes = arnes;
        this.GPS = GPS;
    }

    public String getParapente() { return parapente; }
    public String getCasco() { return casco; }
    public String getArnes() { return arnes; }
    public String getGPS() { return GPS; }

	@Override
	public String toString() {
		return "Parapente [parapente=" + parapente + ", casco=" + casco + ", arnes=" + arnes + ", GPS=" + GPS
				+ ", getParapente()=" + getParapente() + ", getCasco()=" + getCasco() + ", getArnes()=" + getArnes()
				+ ", getGPS()=" + getGPS() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
