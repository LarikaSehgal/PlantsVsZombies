package application;

public class Rock extends Plant{
	private int health = 1000;
	private int attack = 0;
	private final int level = 1;
	private final int cost = 50 ;
	private int xcord ; 
	private int ycord ;
	Rock(int x,int y){
		this.xcord = x ;
		this.ycord = y ;
	}
	public int attack() {
		return this.attack ;
	}
}
