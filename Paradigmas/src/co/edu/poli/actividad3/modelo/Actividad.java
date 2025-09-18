package co.edu.poli.actividad3.modelo;

public class Actividad {
    private String experiencia;
    private String cliente;
    private int fecha_Programada;
    private double precio;
    private String serial;

    public Actividad(String experiencia, String cliente, int fecha_Programada, double precio, String serial) {
        this.experiencia = experiencia;
        this.cliente = cliente;
        this.fecha_Programada = fecha_Programada;
        this.precio = precio;
        this.serial = serial;
    }

    public String getExperiencia() { return experiencia; }
    public String getCliente() { return cliente; }
    public int getFecha_Programada() { return fecha_Programada; }
    public double getPrecio() { return precio; }
    public String getSerial() { return serial; }

	@Override
	public String toString() {
		return "Actividad [experiencia=" + experiencia + ", cliente=" + cliente + ", fecha_Programada="
				+ fecha_Programada + ", precio=" + precio + ", serial=" + serial + ", getExperiencia()="
				+ getExperiencia() + ", getCliente()=" + getCliente() + ", getFecha_Programada()="
				+ getFecha_Programada() + ", getPrecio()=" + getPrecio() + ", getSerial()=" + getSerial()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
