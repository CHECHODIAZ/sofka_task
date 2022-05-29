package taller2semana1_sofka;

public class NaveNasa extends NaveEspacialTripulada {
	
	

	public NaveNasa(Float velocidad) {
		super(velocidad);
	}

	@Override
	public Float acelerar() {
		if(this.velocidad != 0) {
			System.out.println("Nave de la NASA acelerando");
		}else {
			System.out.println("Nave de la NASA no esta acelerando");
		}
	   
		return null;
	}

	@Override
	public Boolean orbitar() {
		if(this.velocidad == 0) {
			System.out.println("Nave de la NASA orbitando");
		}else {
			System.out.println("Nave de la NASA no esta orbitando, velocidad no es constante.");
		}
	   
		return null;
	}

	@Override
	public Float disparar() {
		if(this.velocidad != 0) {
			System.out.println("Nave de la NASA disparando");
		}else {
			System.out.println("Nave de la NASA no esta disparando");
		}
	   
		return null;
	}

}
