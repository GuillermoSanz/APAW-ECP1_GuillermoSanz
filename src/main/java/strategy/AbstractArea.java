package strategy;

public abstract class AbstractArea implements IArea{
	private String nombreFigura;
	
	public AbstractArea(String nombreFigura) {
		this.setNombreFigura(nombreFigura);
	}
	
	@Override
	public abstract float calcularArea();

	public String getNombreFigura() {
		return nombreFigura;
	}

	public void setNombreFigura(String nombreFigura) {
		this.nombreFigura = nombreFigura;
	}
	
}
