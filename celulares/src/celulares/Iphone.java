package superholi;

public class Iphone extends Celular {

	private String IOS;

	public Iphone(String modelo, int imei, String iOS) {
		super(modelo, imei);
		IOS = iOS;
	}

	
	@Override
	public String toString() {
		return "Iphone [IOS=" + IOS + ", getBateria()=" + getBateria() + ", getModelo()=" + getModelo() + ", getImei()="
				+ getImei() + "]";
	}
	
	@Override
	public void Perderbateria() {
		
		System.out.println(" \n soy el celular y esta tiene esta bateria " + this.getBateria());
		this.setBateria(this.getBateria() - 0.1);
		System.out.print(" soy el celular " + this.getModelo() + " perdi bateria y ahora me queda " + this.getBateria());
	}
	
}
