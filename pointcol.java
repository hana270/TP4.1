package point;

public class pointcol extends Point{
private String couleur;

public pointcol() {
}

public pointcol(String couleur,char nom,int x,int y) {
	super(nom,x,y);
	this.couleur=couleur;
	
}
public void setCouleur(String clr) {
	this.couleur=clr;
}
@Override
public String toString() {
	return "point Nom= "+ nom +" [ x=" + x + ", y=" 
			+ y + "] de couleur ="+this.couleur;
}

public void afficher() {
	System.out.println(toString());
}

}
