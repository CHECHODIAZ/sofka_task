package taller2semana1_sofka;

public class NaveChina extends NaveEspacialNoTripulada {

	public NaveChina(Float velocidad) {
		super(velocidad);
	}

	@Override
	public Float acelerar() {
		if(this.velocidad != 0) {
			System.out.println("Nave de la CHINA acelerando");
		}else {
			System.out.println("Nave de la CHINA no esta acelerando");
		}
	   
		return null;
	}

	@Override
	public Boolean orbitar() {
		if(this.velocidad == 0) {
			System.out.println("Nave de la CHINA orbitando");
		}else {
			System.out.println("Nave de la CHINA no esta orbitando");
		}
		return null;
	}

	@Override
	public Float disparar() {
		if(this.velocidad != 0) {
			System.out.println("Nave de la CHINA disparando");
		}else {
			System.out.println("Nave de la CHINA no esta disparando");
		}
	   
		return null;
	}

}
