package superholi;

public class Celular {

	private double bateria;
	private String  modelo;
	private int imei;
	
	
	public Celular(String modelo, int imei) {
		super();
		this.bateria = 5;
		this.modelo = modelo;
		this.imei = imei;
	}
	
	
	public double getBateria() {
		return bateria;
	}
	public void setBateria(double bateria) {
		this.bateria = bateria;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getImei() {
		return imei;
	}
	public void setImei(int imei) {
		this.imei = imei;
	}


	@Override
	public String toString() {
		return "Celular [bateria=" + bateria + ", modelo=" + modelo + ", imei=" + imei + "]";
	}


	public void Perderbateria() {
		this.setBateria(this.getBateria() - 1);
		System.out.print(" soy el celular " + this.getModelo() + " perdi bateria y ahora me queda " + this.getBateria());
	}
	
}
