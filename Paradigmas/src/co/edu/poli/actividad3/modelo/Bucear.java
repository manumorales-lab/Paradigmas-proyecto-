package co.edu.poli.actividad3.modelo;

public class Bucear {
    private String mascara_buceo;
    private String tanque_de_aire;
    private String traje_de_neopreno;

    public Bucear(String mascara_buceo, String tanque_de_aire, String traje_de_neopreno) {
        this.mascara_buceo = mascara_buceo;
        this.tanque_de_aire = tanque_de_aire;
        this.traje_de_neopreno = traje_de_neopreno;
    }

    public String getMascara_buceo() { return mascara_buceo; }
    public String getTanque_de_aire() { return tanque_de_aire; }
    public String getTraje_de_neopreno() { return traje_de_neopreno; }

	@Override
	public String toString() {
		return "Bucear [mascara_buceo=" + mascara_buceo + ", tanque_de_aire=" + tanque_de_aire + ", traje_de_neopreno="
				+ traje_de_neopreno + ", getMascara_buceo()=" + getMascara_buceo() + ", getTanque_de_aire()="
				+ getTanque_de_aire() + ", getTraje_de_neopreno()=" + getTraje_de_neopreno() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
