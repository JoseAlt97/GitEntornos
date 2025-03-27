package Entornos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class PuntoTest {

	@Test
	void testGetX() {
		Scanner n = new Scanner(System.in);
		Punto p1 = new Punto(7,4);
		for (int i=0; i<10;i++) {
			p1.setX(i);
			if (p1.getX()>=11) {
				System.out.println("X es mayor a 5");
			} else {
				System.out.println("X es menor a 5");
			}
			p1.setY(i);
			if (p1.getY()>=11) {
				System.out.println("Y es mayor a 5");
			} else {
				System.out.println("Y es menor a 5");
			}
		}
		n.close();
	}
}