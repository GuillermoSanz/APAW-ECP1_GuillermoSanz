package strategy;

public class AreaTriangulo extends AbstractArea{
	private float base;
	private float altura;

	public AreaTriangulo(float base, float altura) {
		super("triángulo");
		this.base = base;
		this.altura = altura;
	}

	@Override
	public float calcularArea() {
		return (float) (base * altura)/2;
	}
}
