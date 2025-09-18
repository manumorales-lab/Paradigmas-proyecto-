package co.edu.poli.actividad3.modelo;

public class ActividadTuristica {
    private String lugar;
    private String tiempo;
    private String clima;
    private Destino destino;
    private Actividad actividad;
    private Cliente cliente;
    private String serial;
    private int añoActividad;

    public ActividadTuristica(String lugar, String tiempo, String clima, Destino destino, Actividad actividad, Cliente cliente, String serial, int añoActividad) {
        this.lugar = lugar;
        this.tiempo = tiempo;
        this.clima = clima;
        this.destino = destino;
        this.actividad = actividad;
        this.cliente = cliente;
        this.serial = serial;
        this.añoActividad = añoActividad;
    }

    public String getLugar() { return lugar; }
    public String getTiempo() { return tiempo; }
    public String getClima() { return clima; }
    public Destino getDestino() { return destino; }
    public Actividad getActividad() { return actividad; }
    public Cliente getCliente() { return cliente; }
    public String getSerial() { return serial; }
    public int getAñoActividad() { return añoActividad; }

	@Override
	public String toString() {
		return "ActividadTuristica [lugar=" + lugar + ", tiempo=" + tiempo + ", clima=" + clima + ", destino=" + destino
				+ ", actividad=" + actividad + ", cliente=" + cliente + ", serial=" + serial + ", añoActividad="
				+ añoActividad + "]";
	}
}
