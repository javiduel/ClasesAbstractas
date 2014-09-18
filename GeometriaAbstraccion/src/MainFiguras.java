
public class MainFiguras {
 
	public static void main(String args[]){
		Figura f1=new Rectangulo(5,4);
		Figura f2=new Circunferencia(4);
		System.out.println(f1.detalles());
		System.out.println(f1.area());
		System.out.println(f1.perimetro());
		System.out.println(f2.area());
		
	}
}
