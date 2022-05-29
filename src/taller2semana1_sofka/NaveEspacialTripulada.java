package taller2semana1_sofka;

public abstract class NaveEspacialTripulada implements NaveEspacial {
	
	public String name;
	public Float velocidad;
	private Boolean puerta;
	protected Float peso;
	protected String pais;
	
	public NaveEspacialTripulada(Float velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public Boolean volar() {
		if(velocidad != 0) {
		  System.out.println("Nave volando");
		}else {
			System.out.println("velocidad = 0, Nave no esta volando");
		}
		
		return null;
	}

	@Override
	public Boolean aterrizar() {
		if(velocidad == 0) {
			  System.out.println("Nave tripulada aterrizando");
		 }else {
			 System.out.println("Nave tripulada no esta aterrizando");
		 }
		 
		return null;
	}
	
	private void abrirpuertas(Boolean estado) {
		
		this.puerta = estado;
	}
	public abstract Float acelerar();
	
	public abstract Boolean orbitar();
	
	public abstract Float disparar();

}
