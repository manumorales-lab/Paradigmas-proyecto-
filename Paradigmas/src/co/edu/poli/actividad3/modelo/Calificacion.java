package co.edu.poli.actividad3.modelo;

public class Calificacion {
    private String score;
    private Cliente client;
    private String serial;

    public Calificacion(String score, Cliente client, String serial) {
        this.score = score;
        this.client = client;
        this.serial = serial;
    }

    public String getScore() { return score; }
    public Cliente getClient() { return client; }
    public String getSerial() { return serial; }

	@Override
	public String toString() {
		return "Calificacion [score=" + score + ", client=" + client + ", serial=" + serial + ", getScore()="
				+ getScore() + ", getClient()=" + getClient() + ", getSerial()=" + getSerial() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
