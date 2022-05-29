package taller2semana1_sofka;

public class NaveEsa extends NaveEspacialTripulada {

	public NaveEsa(Float velocidad) {
		super(velocidad);
	}

	@Override
	public Float acelerar() {
		if(this.velocidad != 0) {
			System.out.println("Nave de la ESA acelerando");
		}else {
			System.out.println("Nave de la ESA no esta acelerando");
		}
		return null;
	}

	@Override
	public Boolean orbitar() {
		if(this.velocidad == 0) {
			System.out.println("Nave de la ESA orbitando");
		}else {
			System.out.println("Nave de la ESA no esta orbitando, su velocidad esta cambiando");
		}
	   
		return null;
	}

	@Override
	public Float disparar() {
		if(this.velocidad != 0) {
			System.out.println("Nave de la ESA lanzando proyectiles");
		}else {
			 System.out.println("Nave de la ESA no esta lanzando proyectiles");
		}
	  
		return null;
	}

}
