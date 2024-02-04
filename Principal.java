package ejercicioDueñosVehiculos;

public class Principal {

	public static void main(String[] args) {
		
		NIF nif1 = new NIF("00000000T");
		NIF nif2 = new NIF("22222222J");
		
		Coche coche1 = new Coche();
		coche1.setMatricula("0551FGH");
		coche1.setModelo("Q7");
		coche1.setCarburante(1);
		coche1.setColor("negro");
		coche1.setMarca("Audi");
		coche1.setNumeroPuertas(5);
		
		
		Vehiculo v[] = new Vehiculo[1];
		v[0] = coche1;
		
		//System.out.println(coche1.toString());
		
		Vehiculo v2[] = new Vehiculo[1];
		
		Moto moto1 = new Moto();
		moto1.setMatricula("123");
		moto1.setCarburante(1);
		moto1.setClindrada(125);
		moto1.setMarca("BMW");
		
		v2[0] = moto1;
		
		Cliente c1 = new Cliente();
		
		c1.setDni(nif1);
		c1.setNombre("Ibai");
		c1.setApellido("Llanos");
		c1.setDireccion("Barcelona");
		c1.setSaldo(1200);
		c1.setV(v);
		
		
		Cliente c2 = new Cliente();
		
		c2.setDni(nif2);
		c2.setNombre("Iker");
		c2.setApellido("Casillas");
		c2.setDireccion("Madrid");
		c2.setSaldo(2000);
		c2.setV(v2);
		
		
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());

	}

}
