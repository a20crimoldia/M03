package Practica18;

public class urba extends autobus{
	private String ruta;

	public urba(int id, conductor busero, double preuBase, String ruta) {
		super(id, busero, preuBase);
		this.ruta = ruta;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	
	public double preuBitllet(double preuBase) {
		if(ruta == "A") {
			return super.getPreuBase() * 0.1;
		}
		else {
			return super.getPreuBase() * 0.2;
		}
	}
}
