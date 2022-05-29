package taller2semana1_sofka;

public class NaveRusa extends NaveEspacialNoTripulada {

	public NaveRusa(Float velocidad) {
		super(velocidad);
		
	}

	@Override
	public Float acelerar() {
		if(this.velocidad != 0) {
			System.out.println("Nave RUSA acelerando");
		}else {
			System.out.println("Nave RUSA no esta acelerando");
		}  
		return null;
	}

	@Override
	public Boolean orbitar() {
		if(this.velocidad == 0) {
			System.out.println("Nave RUSA esta orbitando");
		}else {
			 System.out.println("Nave RUSA esta acelerando por lo tanto no orbita ");
		}
	  
		return null;
	}

	@Override
	public Float disparar() {
		if(this.velocidad != 0) {
			System.out.println("Nave RUSA disparando");
		}else {
			System.out.println("Nave RUSA disparando");
		}
	   
		return null;
	}

}
