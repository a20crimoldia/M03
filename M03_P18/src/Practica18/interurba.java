package Practica18;

public class interurba extends autobus{
	private double km;

	
	public interurba(int id, conductor busero, double preuBase, double km) {
		super(id, busero, preuBase);
		this.km = km;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}
	
	public double preuBitllet(double preuBase) {
		return super.getPreuBase() * km;
	}
	
}
