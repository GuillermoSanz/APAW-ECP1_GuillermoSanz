package strategy;

public class AreaCircular extends AbstractArea{

	private float radio;
	
	public AreaCircular(float radio) {
		super("círculo");
		this.radio = radio;
	}

	@Override
	public float calcularArea() {
		return (float) (Math.PI * Math.pow(radio, 2));
	}

}
