package Practica18;

public abstract class autobus {
	protected int id;
	protected conductor busero;
	protected double preuBase;
	
	
	public autobus(int id, conductor busero, double preuBase) {
		super();
		this.id = id;
		this.busero = busero;
		this.preuBase = preuBase;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public conductor getBusero() {
		return busero;
	}
	public void setBusero(conductor busero) {
		this.busero = busero;
	}
	public double getPreuBase() {
		return preuBase;
	}
	public void setPreuBase(double preuBase) {
		this.preuBase = preuBase;
	}
	
	
}
