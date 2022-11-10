package superholi;

public class Motorola extends Celular {

	private String versionAndroid;

	public Motorola(String modelo, int imei, String versionAndroid) {
		super(modelo, imei);
		this.versionAndroid = versionAndroid;
	}

	public String getVersionAndroid() {
		return versionAndroid;
	}

	public void setVersionAndroid(String versionAndroid) {
		this.versionAndroid = versionAndroid;
	}

	@Override
	public String toString() {
		return "Motorola [versionAndroid=" + versionAndroid + ", getBateria()=" + getBateria() + ", getModelo()="
				+ getModelo() + ", getImei()=" + getImei() + "]";
	}

	@Override
	public void Perderbateria() {
		
		System.out.println("\n soy el celular y esta es mi bateria " + this.getBateria());
		this.setBateria(this.getBateria() - 0.25);
		System.out.print(" soy el celular " + this.getModelo() + " perdi bateria y ahora me queda " + this.getBateria());
	}
}
