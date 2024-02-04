package ejercicioDueñosVehiculos;

public class Moto extends Vehiculo{

	private double clindrada;
	
	
	public Moto() {
	}
	
	
	public Moto(double clindrada) {
		this.clindrada = 0;
	}
	

	public double getClindrada() {
		return clindrada;
	}


	public void setClindrada(double clindrada) {
		this.clindrada = clindrada;
	}


	@Override
	protected String getTipo() {
		System.out.println("Moto");
		return null;
	}


	@Override
	public String toString() {
		return "Moto [clindrada=" + clindrada + ", getMatricula()=" + getMatricula() + ", getMarca()=" + getMarca()
				+ "]";
	}


}
