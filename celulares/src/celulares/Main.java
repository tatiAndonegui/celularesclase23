package superholi;

public class Main {

	public static void main(String[] args) {
		
		Persona Juliana = new Persona ("juliana", "12323254", "mujer");
		Persona Catalina = new Persona ("catalina", "125467", "nobinaria");
		
		 Motorola CelularJuliana = new Motorola ( "Modelo U9", 145512645,"1.4.6");
		 Iphone CelularCatalina = new Iphone ("Iphone 8", 25614551, "7.4.5");
		 
		 //Juliana.usarCelular(CelularJuliana);
		 //Catalina.usarCelular(CelularCatalina);
		 //CelularCatalina.Perderbateria();
		 //CelularJuliana.Perderbateria();
		 
		 Juliana.HacerLlamada(CelularJuliana, CelularCatalina, Catalina);

	}

}
