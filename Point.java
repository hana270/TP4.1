package point;

public class Point {
	char nom;
	int x;
	int y;
	
public Point() {
	nom='O';
	x=0;
	y=0;
}
public Point(char nom,int x,int y) {
	this.nom=nom;
	this.x=x;
	this.y=y;
}	
public Point(Point p) {
	nom=p.nom;
	x=p.x;
	y=p.y;
	
	
}	
void Affiche(){
		System.out.println("Point "+nom+": ("+x+","+y+")");		
	}

void  deplacer(int a, int b) {
	x=x+a;
	y=y+b;
	}

void  reset() {
	x=0;
	y=0;	
	}
@Override  //t verifilik est ce que shyh eli tekteb fyh shyh ou nn mthln string thottha s shira
public String toString() {
	
	return "Point  "+nom+": ("+x+","+y+")" ;
	}

boolean coïncide_V1 (Point p) {
	return this.x==p.x && this.y==p.y;

	}
static boolean coincide_V2(Point a, Point b) {
	return a.x==b.x && a.y==b.y;
}
}


