package EjeRefactorizacion;

class AreaRectangulo {
	private final int nMagico=2;
	
	public int calcularArea(int base, int altura) {
		return base * altura;
	}

	public int calcularPerimetro(int base, int altura) {
		return (base * nMagico) + (altura * nMagico);
	}

	public int calcularDiagonal(int base, int altura) {
		return (int) Math.sqrt((base * base) + (altura * altura));
	}
}
