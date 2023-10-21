package tp4ex2heritage;

public class TestHeritage {

	public static void main(String[] args) {
		Animal[] tab=new Animal[3];
		
		
		tab[0]=new Animal("gris",20);
		tab[1]=new chats(false,"blanc",20);
		tab[2]=new chiens("Berger Allemand","black",50);
		
		for(int i=0;i<tab.length;i++) {
			tab[i].decrisToi();
			tab[i].manger();
			tab[i].boire();
			tab[i].crier();
		}
		
		for(int i=0;i<tab.length;i++) {
			if(tab[i] instanceof Animal ) {
				System.out.println("L’espèce de cet animal est inconnue");
			}
		}
	}

}
