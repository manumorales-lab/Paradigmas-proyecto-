package co.edu.poli.actividad3.modelo;

public class Destino {
    private String id_destino;
    private String transporte;
    private String hospedaje;

    public Destino(String id_destino, String transporte, String hospedaje) {
        this.id_destino = id_destino;
        this.transporte = transporte;
        this.hospedaje = hospedaje;
    }

    public String getId_destino() { return id_destino; }
    public String getTransporte() { return transporte; }
    public String getHospedaje() { return hospedaje; }

	@Override
	public String toString() {
		return "Destino [id_destino=" + id_destino + ", transporte=" + transporte + ", hospedaje=" + hospedaje
				+ ", getId_destino()=" + getId_destino() + ", getTransporte()=" + getTransporte() + ", getHospedaje()="
				+ getHospedaje() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
