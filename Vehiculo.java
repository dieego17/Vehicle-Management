package ejercicioDueñosVehiculos;

public abstract class Vehiculo {

	protected String matricula;
	protected String marca;
	protected int carburante;

	
	
	protected Vehiculo() {
	}


	protected Vehiculo(String matricula, String marca, int carburante) {
		this.matricula = "";
		this.marca = "";
		this.carburante = 0;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public int getCarburante() {
		return carburante;
	}


	public void setCarburante(int carburante) {
		this.carburante = carburante;
	}




	protected abstract String getTipo();

}
