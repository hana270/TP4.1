package tp4ex2heritage;


public class chats extends Animal{
	private boolean sauvage;
	
public chats() {
	
}
public chats( boolean sauvage,String couleur, int poids) {
	super(couleur,poids);
	this.sauvage=sauvage;
}
}
