package EjeRefactorizacion;

class CalculadoraImpuestos {
	
	public int calcularIVA(int precio) {
		return precio * 21 / 100;
	}

	public int calcularPrecioConIVA(int precio) {
		int total = precio + calcularIVA(precio);
		return total;
	}
}
