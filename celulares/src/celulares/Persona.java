package superholi;

public class Persona {

	private String nombre;
	private String dni;
	private String genero;
	public Persona(String nombre, String dni, String genero) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.genero = genero;
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void usarCelular(Celular celular){
		System.out.println( " soy la persona " + this.getNombre() + " y su celular es " + celular); 
	}
	
	public void HacerLlamada(Celular nuestro, Celular otro, Persona receptor) {
		
		
		System.out.println("\n Soy " + this.getNombre() + " estoy llamando a " + receptor.getNombre() ); 
		nuestro.Perderbateria();
		otro.Perderbateria();
		System.out.println(" \n Termina la llamada..");
	}
	
}
