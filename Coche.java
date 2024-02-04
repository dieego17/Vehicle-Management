package ejercicioDueñosVehiculos;

public class Coche extends Vehiculo{
	
	private String modelo;
	private String color;
	private int numeroPuertas;
	

	public Coche() {
	}


	public Coche(String modelo, String color, int numeroPuertas) {
		this.modelo = "";
		this.color = "";
		this.numeroPuertas = 0;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getNumeroPuertas() {
		return numeroPuertas;
	}


	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}


	@Override
	protected String getTipo() {
		System.out.println("Coche");
		return null;
	}


	@Override
	public String toString() {
		return "Coche [modelo=" + modelo + ", color=" + color + ", numeroPuertas=" + numeroPuertas + ", getMatricula()="
				+ getMatricula() + ", getMarca()=" + getMarca() + "]";
	}


	
	
	
	

}
