package co.edu.poli.actividad3.modelo;

public class Cliente {
    private String id_cliente;
    private String presupuesto;
    private String correo;

    public Cliente(String id_cliente, String presupuesto, String correo) {
        this.id_cliente = id_cliente;
        this.presupuesto = presupuesto;
        this.correo = correo;
    }

    public String getId_cliente() { return id_cliente; }
    public String getPresupuesto() { return presupuesto; }
    public String getCorreo() { return correo; }

	@Override
	public String toString() {
		return "Cliente [id_cliente=" + id_cliente + ", presupuesto=" + presupuesto + ", correo=" + correo
				+ ", getId_cliente()=" + getId_cliente() + ", getPresupuesto()=" + getPresupuesto() + ", getCorreo()="
				+ getCorreo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
