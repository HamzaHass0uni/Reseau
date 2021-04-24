package be.iccbxl.poo.data;

public class Station {
	
	private int num;
	private String nom;
	
	private static int nbStations = 0;

	public Station(String nom) {
		
		
		this.nom = nom;
		this.num= ++nbStations;
	}
	
	
	

}
