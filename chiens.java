package tp4ex2heritage;

public class chiens extends Animal{

private String race;
public chiens() {
	
}
public chiens(String race,String couleur, int poids) {
	super(couleur,poids);
	this.race=race;
}
}
