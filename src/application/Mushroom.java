package application;

public class Mushroom extends Plant{
	private int health = 75;
	private int attack = 10;
	private final int level = 2;
	private final int cost = 25 ;
	private int xcord ; 
	private int ycord ;
	Mushroom(int x,int y){
		this.xcord = x ;
		this.ycord = y ;
	}
	public int attack() {
		return this.attack ;
	}
}
