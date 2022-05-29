package taller2semana1_sofka;

public abstract class NaveEspacialNoTripulada extends NaveEspacialTripulada implements NaveEspacial {

	public NaveEspacialNoTripulada(Float velocidad) {
		super(velocidad);
	}

	@Override
	public Boolean volar() {
        if(this.velocidad != 0) {
        	System.out.println("nave espacial no tripulada volando");
        }else {
        	System.out.println("velocidad = 0, nave espacial no tripulada no esta volando");
        }
        
		return null;
	}

	@Override
	public Boolean aterrizar() {
	    if(this.velocidad == 0) {
	    	System.out.println("nave espacial no tripulada aterrizando");
	    }else {
	    	System.out.println("nave espacial no tripulada no esta aterrizando");
	    }
		return null;
	}
}
