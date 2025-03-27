package Entornos;

public class ClasePrincipal {

	public static void main(String[] args) {
		Punto p1=new Punto();
		Punto p2=new Punto();
		Punto p3=new Punto();
		p1.y=5;
		p1.x=0;
		p2.y=10;
		p2.x=10;
		p3.y=-3;
		p3.x=7;
		System.out.println(p1.y+","+p1.x);
		System.out.println(p2.y+","+p2.x);
		System.out.println(p3.y+","+p3.x);
		System.out.println("hola,"+(p1.x+p2.x));
		System.out.println(p2.y+p3.y+","+(p2.x+p3.x));
		System.out.println(p3.y+p1.y+","+(p3.x+p1.x));
	}

}
