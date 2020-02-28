package Mathieu_De_Jesus.pglp_3_3;

public class Position {
	
	public int x,y;
	
	public Position() {
		x = y = 0;
	}
	
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "("+ x + "," + y + ")";
	}
}
