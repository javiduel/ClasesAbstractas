
public class Circunferencia extends Figura {

	private int radio;
	
public Circunferencia() {
		
	}
	
public Circunferencia(int radio) {
		
		this.radio = radio;
	}

	

	public int getRadio() {
	return radio;
}

public void setRadio(int radio) {
	this.radio = radio;
}

	public double area() {
		
		return Math.PI*Math.pow(radio, 2);
	}

	public double perimetro() {
		
		return 2*Math.PI*radio;
	}

   public String detalles(){
	   return "Soy un circulo de radio "+radio;
   }

}
