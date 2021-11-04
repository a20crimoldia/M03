package Practica18;

public class conductor {
	private String nom;
	private double salari;
	
	
	public conductor(String nom, double salari) {
		this.nom = nom;
		this.salari = salari;
	}
	
	
	@Override
	public String toString() {
		return "conductor [nom=" + nom + ", salari=" + salari + "]";
	}


	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getSalari() {
		return salari;
	}
	public void setSalari(double salari) {
		this.salari = salari;
	}
	
	
}
